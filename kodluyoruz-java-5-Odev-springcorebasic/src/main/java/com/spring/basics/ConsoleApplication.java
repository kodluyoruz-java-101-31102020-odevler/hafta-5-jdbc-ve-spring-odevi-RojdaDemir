package com.spring.basics;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


import com.spring.basics.data.exporter.DataExporter;
import com.spring.basics.dto.Salary;
import com.spring.basics.model.service.DepartmentService;
import com.spring.basics.model.service.EmployeeService;

//Annotationların kütüphaneleri yazılmak zorundadır.
	@Component
	public class ConsoleApplication implements CommandLineRunner{ 
		
		@Autowired
		private DataExporter dataExporter;
		
		//Bu etiketle dependency injection işlemi yapılır.Yani arada gevşek bir bağımlılık bulunmaktadır.EmployeeService ile haberleşir.
		@Autowired
		private EmployeeService employeeService;
		
		
		@Autowired
		private DepartmentService departmentService;
		
		@Autowired
		private ApplicationContext applicationContext;
		
		public void run(String... args) throws Exception{
			
			//dependency injection yöntemidir.Burada Spring Context ile haberleşilir.Ey Spring Context senden Salary sınıfından
			//bir nesne istiyorum bana verir misin der.Eğer elinde böyle bir sınıf varsa nesne getirilir.XML tabanlı olduğu için 
		    //Bean ile sınıf kütüphanesinin tanımlanmış olması gerekir.İçerisinde ismi ve paketi bulunmaktadır.
			Salary salary2 = applicationContext.getBean("salary",Salary.class);
			salary2.setValue(15000);
			salary2.setCreateDate(new Date());
			System.out.println(salary2);
			
			//dependency injection
			//Aynı sınıftan iki farklı nesne oluşur.
			Salary salary1 = applicationContext.getBean("salary",Salary.class);
			salary1.setValue(20000);
			salary1.setCreateDate(new Date());
			System.out.println(salary1);
			
			String json = dataExporter.convertSalaryToJson(salary1);
			System.out.println(json);
			
			json = dataExporter.convertSalaryToJson(salary2);
			System.out.println(json);
			
			//employeeService ile çalışan listesi getirilir.Service ile veriler üzerinde bir takım
			//işlemler yapılır.
			System.out.println("Çalışan Listesi");
			System.out.println(employeeService.getAll());
			
			System.out.println("Departman Listesi");
			System.out.println(departmentService.getAll());
			
		}
		
		public void sayHello() {
			
			System.out.println("Hello from ConsoleApplication!");
		}
	}
	
	
	

