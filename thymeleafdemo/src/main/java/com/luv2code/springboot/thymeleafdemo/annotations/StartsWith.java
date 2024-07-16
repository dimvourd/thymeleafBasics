package com.luv2code.springboot.thymeleafdemo.annotations;


import com.luv2code.springboot.thymeleafdemo.validations.StartsWithConstraints;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = StartsWithConstraints.class)
public @interface StartsWith {
    String value() default "LUV";
    String message() default "Should start with LUV";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}