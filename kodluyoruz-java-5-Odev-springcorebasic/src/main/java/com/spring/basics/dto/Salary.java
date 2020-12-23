package com.spring.basics.dto;

import java.util.Date;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Component etiketi ile bu sınıfı SpringApplicationContext'e dahil ediyoruz.
@Component

//prototype olarak tanımlandığı için her çağrıldığında farklı nesne üretilir.
//Spring Application Context her dependency injection için yeni bir Salary nesnesi üretir.

//Fakat scope'ın içi tanımlanmazsa default olarak singleton özelliğindedir.Yani tek bir nesne üretilir.

@Scope("prototype")

public class Salary {

	private double value;
	private Date createDate;
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}


