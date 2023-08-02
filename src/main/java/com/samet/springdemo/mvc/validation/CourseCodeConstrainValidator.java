package com.samet.springdemo.mvc.validation;


import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstrainValidator implements ConstraintValidator<CourseCode,String> {

   private String coursePrefix;


    @Override
    public void initialize(CourseCode theCourseCode) {
        coursePrefix=theCourseCode.value();
    }


    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {

        boolean result;

        if(theCode !=null){
            result=theCode.startsWith(coursePrefix);
        }else{
            result=true;
        }

        return result;
    }
}
