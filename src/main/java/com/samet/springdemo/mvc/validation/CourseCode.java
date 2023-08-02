package com.samet.springdemo.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstrainValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME) //process it at run time
public @interface CourseCode {

    //define default course code
    public String value() default "COM";

    //define default error message
    public String message() default "Must start with COM";

    //define default group
    public Class<?>[] groups() default  {};

    //define default payloads
    public Class<? extends Payload>[] payload() default {};
}
