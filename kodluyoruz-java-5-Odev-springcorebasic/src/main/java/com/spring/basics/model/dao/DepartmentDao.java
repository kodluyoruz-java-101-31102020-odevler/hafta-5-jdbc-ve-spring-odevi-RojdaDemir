package com.spring.basics.model.dao;

import java.util.List;

public interface DepartmentDao {
    
	//Bağımlılığı azaltabilmek için soyutlamayı kullandık.Departman veri tabanıyla haberleşen bir interface
	//tanımlaması yaptık.
    public List<String> getNames();
}
