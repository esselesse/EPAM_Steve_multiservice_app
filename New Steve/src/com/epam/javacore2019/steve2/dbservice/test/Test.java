package com.epam.javacore2019.steve2.dbservice.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//эта аннотация запускается при з-апуске runtests изи DBApplication, все тесты лежат в WhereTests
//рефлексия - возможность получить данные о классе через спец апи

@Retention(RetentionPolicy.RUNTIME)//фигачится в рантайме и не игнорируется
@Target(ElementType.METHOD)//относится к методу
public @interface Test {
    boolean enabled() default true;//по дефолту тру
}
