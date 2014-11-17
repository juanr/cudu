package org.scoutsfev.cudu.domain;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ConversorTipoAsociado implements AttributeConverter<TipoAsociado, Character> {

    @Override
    public Character convertToDatabaseColumn(TipoAsociado tipoAsociado) {
        return tipoAsociado.getTipo();
    }

    @Override
    public TipoAsociado convertToEntityAttribute(Character tipo) {
        if (tipo == null)
            return null;
        return TipoAsociado.parse(tipo);
    }
}
