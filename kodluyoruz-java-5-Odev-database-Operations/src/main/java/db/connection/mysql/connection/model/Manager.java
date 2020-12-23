package db.connection.mysql.connection.model;

import java.util.Date;

public class Manager {

	private Employee employee;
	private Department department;
	private Date to_date;
	private Date from_date;
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Date getTo_date() {
		return to_date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Manager [employee=" + employee + ", department=" + department + ", to_date=" + to_date + ", from_date="
				+ from_date + "]";
	}
	
	
	
}
