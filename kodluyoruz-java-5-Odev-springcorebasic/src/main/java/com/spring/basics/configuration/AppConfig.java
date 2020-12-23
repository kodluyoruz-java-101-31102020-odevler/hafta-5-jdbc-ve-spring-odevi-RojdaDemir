package com.spring.basics.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.ConsoleApplication;
import com.spring.basics.data.exporter.SalaryJsonConverter;

//Configuration etiketlemesi yaptık. ComponentScan basePackages ile tanımlanan paketler içinde dolaşılır.
@Configuration
@ComponentScan(basePackages = {
		"com.spring.basics.dto",
		"com.spring.basics.aspect",
		"com.spring.basics.data.exporter",
		"com.spring.basics.model.dao.impl",
		"com.spring.basics.model.service.impl"
		
})

//Bean etiketi ile tek tek tanımlama yapmamız gerekir.
//Bu etiketi kullanmak pek kullanışlı değildir.


public class AppConfig {

	//Üretilen nesneye isim ataması yapılır.
	@Bean("sJsonConverter")
    
	//Burada singleton tasarım prensibi bulunmaktadır.Yani bu metotta sadece nesne üretilir ve döndürülür. Tek bir görevi bulunmaktadır.
	public SalaryJsonConverter createSalaryJsonConverter() {
		
		return new SalaryJsonConverter();
		
	}
	
	//Aynı şekilde bu da singleton'dır. ConsoleApplication nesnesi üretilir ve döndürülür.
	@Bean("consoleApplication")
	
	public ConsoleApplication createConsoleApplication() {
		
		return new ConsoleApplication();
		
	}
	
	/*
	@Bean("departmentDaoImpl")
	
	public DepartmentDao createDepartmentDao() {
		
		return new DepartmentDaoImpl();
	}
	
	*/
		
}
