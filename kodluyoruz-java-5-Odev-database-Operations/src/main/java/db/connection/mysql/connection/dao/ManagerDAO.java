package db.connection.mysql.connection.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import db.connection.mysql.connection.DbSQLQuery;
import db.connection.mysql.connection.model.Department;
import db.connection.mysql.connection.model.Employee;
import db.connection.mysql.connection.model.Manager;

public class ManagerDAO {

	private static final Logger logger = Logger.getLogger(ManagerDAO.class);
	
	public List<Manager> loadAllActiveManagers() {
		
		List<Manager> managers = new ArrayList<Manager>();
		
		String sql = "select emp.*,dm.from_date, dm.to_date, dp.dept_no , dp.dept_name from employees emp \n" + 
				"left join dept_manager dm on dm.emp_no = emp.emp_no\n" + 
				"left join departments dp on dp.dept_no = dm.dept_no\n" + 
				"where dm.to_date >= NOW();";
		
		ResultSet resultSet = DbSQLQuery.select(sql);
		
		try {
			
			if(resultSet == null) {
				return managers;
			}
			
			while(resultSet.next()) {
				
				Manager manager = createManager(resultSet);
				managers.add(manager);
			}
	    }
		catch(Exception e) {
			
			logger.error(e.getMessage());
			
		}
			
		// Burada halen aktif olarak yöneticilik yapan tüm çalışanları departman isimleriyle birlikte liste halinde hazırlayınız.
		// Manager sınıfını sizin oluşturdum. 
		// İpucu: Bu sorgunun bir benzerini derste anlatmıştım. Hatta "sql_query_samples.sql" dosyası içinde benzeri mevcut.
		
		return managers;
	}
	
	
	public Manager createManager(ResultSet resultSet) throws SQLException{
		
		Employee employee = new Employee();
		employee.setId(resultSet.getLong("emp_no"));
		employee.setName(resultSet.getString("first_name"));
		employee.setLastName(resultSet.getString("last_name"));
		employee.setGender(resultSet.getString("gender"));
		employee.setBirthDate(resultSet.getDate("birth_date"));
		employee.setHireDate(resultSet.getDate("hire_date"));
		
		Department department = new Department();
		department.setDeptNo(resultSet.getString("dept_no"));
		department.setName(resultSet.getString("dept_name"));
		
		Manager manager = new Manager();
		manager.setFrom_date(resultSet.getDate("from_date"));
		manager.setTo_date(resultSet.getDate("to_date"));
		
		manager.setEmployee(employee);
		manager.setDepartment(department);
		
		return manager;
	   
	}
}
