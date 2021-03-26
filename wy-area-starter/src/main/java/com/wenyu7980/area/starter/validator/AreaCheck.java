package com.wenyu7980.area.starter.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.PARAMETER;

/**
 * @author wenyu
 */
@Target({ ElementType.FIELD, PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = AreaCheckValidator.class)
public @interface AreaCheck {
    String message() default "文件权限不足,请重新上传";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    /** 最小等级,省1，市2，区县3 */
    int level() default 3;
}
