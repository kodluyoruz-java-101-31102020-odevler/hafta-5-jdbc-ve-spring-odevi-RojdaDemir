package com.spring.basics.aspect.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Annotation kütüphaneleri java.lang.annotation'da bulunur.

//Annotation tanımlamasıdır.Metot çalışma süresi boyunca aktiftir.
//Retention olarak runtime'ı kullanıyoruz.
//Target için ise kaynak metot olduğu için metot tipinde bir element tanımı yaparız.
@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.METHOD)

//interface tipinde bir annotation'dır.
public @interface MethodRunningTime {

	boolean active();
}
