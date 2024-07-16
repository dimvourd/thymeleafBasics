package com.luv2code.springboot.thymeleafdemo.validations;

import com.luv2code.springboot.thymeleafdemo.annotations.StartsWith;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StartsWithConstraints implements ConstraintValidator<StartsWith, String> {

    private String startsWith;

    @Override
    public void initialize(StartsWith constraintAnnotation) {
        startsWith = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String field, ConstraintValidatorContext constraintValidatorContext) {
        if(field != null)
            return field.startsWith(startsWith);
        else return true;
    }
}
