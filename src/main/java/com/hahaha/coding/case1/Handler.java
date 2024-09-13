package com.hahaha.coding.case1;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Handler {
    String name() default "";

    /**
     * 可用于扩展，将不同的handler注入到不同的factory里面
     */
    int type() default 0;
}
