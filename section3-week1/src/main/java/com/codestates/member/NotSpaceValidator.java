package com.codestates.member;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotSpaceValidator implements ConstraintValidator<NotSpace,String> {

    public void initialize(NotSpace constraintAnnotation){
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    public boolean isValid(String value, ConstraintValidatorContext context){
        return value == null || StringUtils.hasText(value);
    }

}
