package com.Yux1u.starter.elastic.annocations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Lin
 * @date 2020/12/8 17:04
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Index {
    /**
     * 索引库名称，必填
     * @return 索引库名称
     */
    String value();
}
