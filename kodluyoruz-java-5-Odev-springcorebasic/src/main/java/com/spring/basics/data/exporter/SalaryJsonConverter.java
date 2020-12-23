package com.spring.basics.data.exporter;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.basics.dto.Salary;

public class SalaryJsonConverter {

	//Salary sınıfını jsona dönüştüren bir sınıf tanımladık.İçerisinde bu işlemi yapan metot bulunmaktadır.
	//Salary sınıfından bir nesneyi parametre olarak alır.JsonProcessingException tipinde bir hata fırlatmaktadır.
	public String convertToJson(Salary salary) throws JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(salary);
	}
	
}
