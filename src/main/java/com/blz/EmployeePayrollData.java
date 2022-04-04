package com.blz;

import java.time.LocalDate;

public class EmployeePayrollData {
	private int id;
	private String name;
	private String gender;
	private double salary;
	private LocalDate start_date;

	public EmployeePayrollData(int id, String name, String gender, double salary, LocalDate start_date) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.start_date = start_date;
	}

	public EmployeePayrollData() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getStart_date() {
		return start_date;
	}

	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}

	@Override
	public String toString() {
		return "EmployeePayrollData{" + "id=" + id + ", name='" + name + '\'' + ", gender='" + gender + '\''
				+ ", salary=" + salary + ", localDate=" + start_date + '}';
	}
}