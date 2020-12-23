package com.spring.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.spring.basics.configuration.AppConfig;


//Eğer @SpringBootApplication yöntemiyle etiketleme yaparsak uygulamadaki
//tüm paketler üzerinde dolaşılır. Bu SpringBoot'un default özelliğidir.

//Bu yöntemde kısıtlama yaptık.Yani belirtilen paket içerisindeki etiketlenmiş classları tanımasını sağladık.
@SpringBootApplication(scanBasePackages= {
		"com.spring.basics.configuration"			
})

//xml tabanlı konfigürasyonlar için ImportResource kullanılır.
@ImportResource("applicationContext.xml")

//Elimizdeki Spring configuration sınıfını Spring boot uygulamasında kullanmak için import ediyoruz. 
@Import(AppConfig.class)
public class Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
		
	}

}
