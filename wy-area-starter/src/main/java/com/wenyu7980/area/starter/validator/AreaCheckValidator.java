package com.wenyu7980.area.starter.validator;

import com.wenyu7980.area.starter.util.AreaUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author wenyu
 */
public class AreaCheckValidator implements ConstraintValidator<AreaCheck, Integer> {

    private AreaCheck areaCheck;

    @Override
    public void initialize(AreaCheck constraintAnnotation) {
        this.areaCheck = constraintAnnotation;
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        return AreaUtils.getLevelById(value).compareTo(areaCheck.level()) >= 0;
    }

}
