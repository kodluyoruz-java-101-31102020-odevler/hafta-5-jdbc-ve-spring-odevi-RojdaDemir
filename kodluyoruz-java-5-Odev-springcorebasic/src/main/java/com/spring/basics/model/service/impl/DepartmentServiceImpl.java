package com.spring.basics.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.basics.model.dao.DepartmentDao;
import com.spring.basics.model.service.DepartmentService;

//Service sınıflarını tanımlamak için service etiketini kullanırız.
@Service("departmentServiceImpl")
public class DepartmentServiceImpl implements DepartmentService{

	//Dependency injection yöntemidir.
	//DepartmentDao ile haberleşilir.Servis katmanı veri tabanı ile haberleşmek durumundadır.
	@Autowired
	private DepartmentDao departmentDao;

	public List<String> getAll() {
		
		List<String> names = departmentDao.getNames();
		return names;
		
	}

}
