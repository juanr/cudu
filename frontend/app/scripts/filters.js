'use strict';

var filters = angular.module('cuduFilters', []);

filters.filter('rama', function() {
  return function(rama) {
    if (rama === 'C') { return 'Castores'; }
    if (rama === 'M') { return 'Lobatos'; }
    if (rama === 'E') { return 'Exploradores'; }
    if (rama === 'P') { return 'Pioneros'; }
    if (rama === 'R') { return 'Compañeros'; }
    return '¿?';
  };
});

filters.filter('tipoAsociado', function() {
  return function(rama) {
    if (rama === 'J') { return 'Jóven'; }
    if (rama === 'K') { return 'Kraal'; }
    if (rama === 'C') { return 'Comité'; }
    return '¿?';
  };
});
