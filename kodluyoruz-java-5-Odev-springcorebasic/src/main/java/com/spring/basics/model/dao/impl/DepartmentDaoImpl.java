package com.spring.basics.model.dao.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.basics.aspect.annotation.MethodRunningTime;
import com.spring.basics.model.dao.DepartmentDao;

//database ile iletişime geçen sınıfları repository etiketi ile çağırırız.
@Repository("departmentDaoImpl")
public class DepartmentDaoImpl implements DepartmentDao{


	@MethodRunningTime(active = true)
	public List<String> getNames() {
		
		return Arrays.asList("İnsan Kaynakları","Mühendislik","Pazarlama");
	}

}
