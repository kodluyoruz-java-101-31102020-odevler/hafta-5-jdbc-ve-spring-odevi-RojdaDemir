package com.spring.basics.model.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.basics.aspect.annotation.MethodRunningTime;
import com.spring.basics.model.dao.EmployeeDao;

//Veri tabanıyla ilgili sınıfları repository etiketi ile tanımlarız.
@Repository("employeeDaoImp")
public class EmployeeDaoImpl implements EmployeeDao{

	//Metodun çalışma zamanını ölçebilmek için aktif olma durumunu true'ya çekiyoruz.
	@MethodRunningTime( active = true)
	public List<String> getNames() {
		
		return Arrays.asList("Ali","Ahmet","Ayşe");
		
	}

	
	
	
}
