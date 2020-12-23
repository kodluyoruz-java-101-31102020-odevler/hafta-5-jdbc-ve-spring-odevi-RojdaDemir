package com.spring.basics.model.dao;

import java.util.List;

public interface EmployeeDao {

	//Employee veri tabanıyla etkileşim halinde olan bir interface tanımlaması yaptık.
	 List<String> getNames();
}
