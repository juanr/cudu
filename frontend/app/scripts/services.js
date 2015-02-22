(function() {
'use strict';

// TODO Add ngCookies here
var cuduServices = angular.module('cuduServices', ['ngResource']);

var metodos = {
  'crear': { method: 'POST' },
  'actualizar': { method: 'PUT' },
  'query': { method: 'GET', params: { size: 200 }, isArray: false },
  'queryAll': { method: 'GET', params: { }, isArray: true }
};

var metodosAsociado = _.clone(metodos);
metodosAsociado['activar'] = { url: '/api/asociado/:id/activar', method: 'PUT' };
metodosAsociado['desactivar'] = { url: '/api/asociado/:id/desactivar', method: 'PUT' };
metodosAsociado['asignarCargo'] = { url: '/api/asociado/:id/cargo/:cargoId', method: 'PUT' };
metodosAsociado['asignarCargoCustom'] = { url: '/api/asociado/:id/cargo', method: 'POST' };
metodosAsociado['eliminarCargo'] = { url: '/api/asociado/:id/cargo/:cargoId', method: 'DELETE' };

cuduServices.factory('Asociado', ['$resource',
  function($resource) {
    return $resource('/api/asociado/:id', {}, metodosAsociado);
  }]);

cuduServices.factory('Grupo', ['$resource',
  function($resource) {
    return $resource('/api/grupo/:id', {}, metodos);
  }]);

cuduServices.factory('Actividad', ['$resource',
  function($resource) {
    return $resource('/api/actividad/:id', {}, {
      'crear'      : { method: 'POST' },
      'actualizar' : { method: 'PUT' },
      'queryAll'   : { method: 'GET', params: { }, isArray: true },
      'afegirBranca'    : { url: '/api/actividad/:id/rama', method: 'POST' },
      'afegirAssistent' : { url: '/api/actividad/:id/asociado/:asociadoId', method: 'POST' },
      'llevarAssistent' : { url: '/api/actividad/:id/asociado/:asociadoId', method: 'DELETE' },
      'canviarEstat'    : { url: '/api/actividad/:id/asociado/:asociadoId/estado', method: 'POST' }
    });
  }]);

cuduServices.factory('Typeahead', [function() {
  return {
    'asociado': function() {
      var source = new Bloodhound({
        datumTokenizer: function(d) { return Bloodhound.tokenizers.whitespace(d.nombre); },
        queryTokenizer: Bloodhound.tokenizers.whitespace,
        remote: {
          url: '/api/typeahead/asociado/%QUERY',
          filter: function(response) { return response.content; }
        }
      });
      source.initialize();
      return { 
        displayKey: function(r) { return r.nombre + ' ' + r.apellidos; }, 
        source: source.ttAdapter() 
      };
    }
  };
}]);

cuduServices.factory('Graficas', ['$http', function($http) {
  var _rango5pink = ['#fce4ec', '#fdbfce', '#fa99b1', '#f47195', '#ec407a'];
  var _colorLinea = "rgba(148,159,177,1)";
  var _coloresRamas = _.map(_rango5pink, function(c) {
    return { fillColor: _colorLinea, strokeColor: c, };
  });

  var _colorRellenoTipo = ['#9FA8DA', '#7986CB', '#3F51B5'];
  var _coloresTipos = _.map(_colorRellenoTipo, function(c) {
    return { fillColor: _colorLinea, strokeColor: c, };
  });

  return {
    coloresRama: _coloresRamas,
    coloresTipo: _coloresTipos,
    login: function() {
      return $http.get('/api/graficas/login');
    },
    grupo: function(grupoId) {
      return $http.get('/api/graficas/grupo/' + grupoId);
    }
  };
}]);

cuduServices.factory('Usuario', ['$http', '$cookies', '$q', function($http, $cookies, $q) {
  // Angular carga algunos de los controladores antes que el servidor devuelva
  // los datos del usuario actual, por ello es necesario establecer un usuario
  // anónimo que evite problemas al navegar propiedades.
  var usuarioAnonimo = { grupo: null };
  var svc = { usuario: usuarioAnonimo };

  svc.obtenerActual = function() {
    var respuesta = $http.get('/api/usuario/actual');
    respuesta.success(function(data, status) { svc.usuario = data; });
    return respuesta;
  };

  svc.autenticar = function(email, password, captcha) {
    delete $cookies['JSESSIONID'];
    var respuesta = $http.post('/api/usuario/autenticar', { 'email': email, 'password': password, 'captcha': captcha });
    respuesta.success(function(data, status) { svc.usuario = data; });
    return respuesta;
  };

  svc.desautenticar = function() {
    var respuesta = $http.post('/api/usuario/desautenticar', {});
    var limpiar = function() {
      delete $cookies['JSESSIONID'];
      svc.usuario = usuarioAnonimo;
    };
    respuesta.success(limpiar).error(limpiar);
    return respuesta;
  };

  svc.activar = function(id, email) {
    return $http.post('/api/usuario/activar/' + id, email);
  };

  svc.desactivar = function(id) {
    return $http.post('/api/usuario/desactivar/' + id);
  };

  svc.calcularEdad = function(valor) {
    var fechaNacimiento = new Date(valor);
    if (isNaN(fechaNacimiento.valueOf()))
      return '¿?';
    var hoy = new Date();
    return hoy.getYear() - fechaNacimiento.getYear();
  };

  svc.cambiarIdioma = function(codigo) {
    return $http.post('/api/usuario/lenguaje', codigo);
  };

  return svc;
}]);

// Servicio de manipulación del DOM fuera del scope de angular, para cambiar
// entre el modo de login y el de APP y renderizar algunos estáticos adicionales.
// No muy elegante, pero es rápido y evita bindings en el rootScope.
angular.module('cuduDom', []).factory('Dom', ['$rootScope', 'Traducciones', 'RolesMenu', function($rootScope, Traducciones, RolesMenu) {
  var establecerTextosMenu = function(nombreCompletoUsuario, codigoGrupo) {
    // ELementos del menú, para uso con bind-once.
    $rootScope.menu = {
      actividades: Traducciones.texto('menu.actividades'),
      asociados: Traducciones.texto('menu.asociados'),
      cursos: Traducciones.texto('menu.cursos'),
      grupos: Traducciones.texto('menu.grupos'),
      liquidaciones: Traducciones.texto('menu.liquidaciones'),
      miembros: Traducciones.texto('menu.miembros'),
      migrupo: Traducciones.texto('menu.migrupo'),
      misdatos: Traducciones.texto('menu.misdatos'),
      participantes: Traducciones.texto('menu.participantes'),
      permisos: Traducciones.texto('menu.permisos'),
      salir: Traducciones.texto('menu.salir'),
      nombreCompletoUsuario: nombreCompletoUsuario,
      codigoGrupo: codigoGrupo
    };
  };

  return {
    loginCompleto: function(usuario, lang) {
      // TODO Mover algunas de las propiedades a bindonce
      $('#cuduNav, #cuduNavBg').removeClass('hidden');
      $('#checkLenguajeES, #checkLenguajeCA').hide();
      $('#checkLenguaje' + lang.toUpperCase()).show();

      var grupo = usuario.grupo || { id: 'up' };
      establecerTextosMenu(usuario.nombreCompleto, grupo.id.toLowerCase());

      var rolMenu = RolesMenu.ASOCIADO;
      if ((usuario.tipo === 'T') && (usuario.ambitoEdicion === 'E')) {
        rolMenu = RolesMenu.LLUERNA;
      } else if  ((usuario.tipo === 'T') && (usuario.ambitoEdicion === 'F' || usuario.ambitoEdicion === 'A')) {
        rolMenu = RolesMenu.TECNICO;
      }
      $('body').addClass(rolMenu);
    }    
  };
}]);

}());
