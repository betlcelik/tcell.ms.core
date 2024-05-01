package com.betulcelik.annotations;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//anatasyon olan interfaceler @ işareti ile ifade  edilir ve anatasyonun ne zmaan devreye girceği , hangi tip elementlere verilebileceği
//bilgilerini de veriyoruz
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@ComponentScan(basePackages = {"com.betulcelik"}) //bağımlılıkların taranmasını sağlıyor
//Kullandığımız dış paketlerin ismini vererek o paketin altındaki componentlerin scan edilmesini sağlar
//@EntityScan(basePackages = "com.betulcelik.entities")
public @interface EnableSecurity {
}
