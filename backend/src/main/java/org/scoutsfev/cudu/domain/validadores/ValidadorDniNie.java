package org.scoutsfev.cudu.domain.validadores;

import com.google.common.base.CharMatcher;
import com.google.common.base.Strings;
import com.google.common.primitives.Ints;
import org.hibernate.validator.constraintvalidation.HibernateConstraintValidatorContext;
import org.scoutsfev.cudu.domain.Asociado;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidadorDniNie implements ConstraintValidator<ValidarDniNie, Asociado> {

    private static final String MSG_FORMATO_INCORRECTO = "{DniNie.FormatoIncorrecto}";
    public static final String MSG_DIGITO_CONTROL = "{DniNie.DigitoControlIncorrecto}";
    private static final String MSG_REQUERIDO_MAYOR_EDAD = "{DniNie.RequeridoMayorEdad}";

    public static final String DIGITO_CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE";

    @Override
    public void initialize(ValidarDniNie constraintAnnotation) { }

    @Override
    public boolean isValid(Asociado asociado, ConstraintValidatorContext context) {
        if (asociado == null || asociado.getFechaNacimiento() == null)
            return true;

        context.disableDefaultConstraintViolation();
        
        if (Strings.isNullOrEmpty(asociado.getDni()))
        {
            boolean mayorDeEdad = asociado.getFechaNacimiento().plus(18, ChronoUnit.YEARS).isBefore(LocalDate.now());
            if (mayorDeEdad) {
                context.buildConstraintViolationWithTemplate(MSG_REQUERIDO_MAYOR_EDAD).addConstraintViolation();
                return false;
            } else {
                return true;
            }
        }

        return validarDniNie(asociado.getDni(), context);
    }

    public static boolean validarDniNie(String value, ConstraintValidatorContext context)
    {
        String dni = CharMatcher.JAVA_LETTER_OR_DIGIT.retainFrom(value).toUpperCase();
        if (dni.length() < 2) {
            context.buildConstraintViolationWithTemplate(MSG_FORMATO_INCORRECTO).addConstraintViolation();
            return false;
        }

        if (CharMatcher.anyOf("KLMXYZ").matches(dni.charAt(0))) {
            boolean correcto = CharMatcher.JAVA_DIGIT.matchesAllOf(dni.substring(1, dni.length()));
            if (!correcto) {
                context.buildConstraintViolationWithTemplate(MSG_FORMATO_INCORRECTO).addConstraintViolation();
                return false;
            }
            return true;
        }

        Integer valorNumerico = Ints.tryParse(dni.substring(0, dni.length() - 1));
        if (valorNumerico == null) {
            context.buildConstraintViolationWithTemplate(MSG_FORMATO_INCORRECTO).addConstraintViolation();
            return false;
        }
        char digitoControl = DIGITO_CONTROL.charAt(valorNumerico % 23);
        boolean correcto = digitoControl == dni.charAt(dni.length() - 1);
        if (correcto)
            return true;

        HibernateConstraintValidatorContext hibernateContext = context.unwrap(HibernateConstraintValidatorContext.class);
        hibernateContext.disableDefaultConstraintViolation();
        hibernateContext.addExpressionVariable("digitoCorrecto", digitoControl);
        hibernateContext.buildConstraintViolationWithTemplate(MSG_DIGITO_CONTROL).addConstraintViolation();
        return false;
    }
}
