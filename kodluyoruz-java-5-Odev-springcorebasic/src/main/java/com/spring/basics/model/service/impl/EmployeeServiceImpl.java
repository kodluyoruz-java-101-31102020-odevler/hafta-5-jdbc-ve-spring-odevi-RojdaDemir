package com.spring.basics.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.spring.basics.model.dao.EmployeeDao;
import com.spring.basics.model.service.EmployeeService;

//Servis sınıfı olduğu için service etiketiyle tanımlama yaptık.
//Scope default olarak singleton özelliği gösterir.Ayrıca belirtmesek de olurdu.
@Service("employeeServiceImpl")
@Scope("singleton")
public class EmployeeServiceImpl implements EmployeeService{

	//Nesne bağımlılığı bulunmaktadır.
	@Autowired
	private EmployeeDao employeeDao;
	
	public List<String> getAll() {
	
		return employeeDao.getNames();
	}

}
