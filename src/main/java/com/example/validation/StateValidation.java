package com.example.validation;

import com.example.anno.State;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StateValidation implements ConstraintValidator<State,String> {
    @Override
    public void initialize(State constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    /**
     *
     * @param s 将来要校验的数据
     * @param constraintValidatorContext in which the constraint is evaluated
     * @return 如果返回false,则校验不通过,如果返回true,则校验通过
     */
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        //提供校验规则
        if (s == null){
            return false;
        }
        return s.equals("已发布") || s.equals("草稿");
    }
}
