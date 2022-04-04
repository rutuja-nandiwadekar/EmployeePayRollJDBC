package com.blz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollDBService {
	public List<EmployeePayrollData> readData() {
		String sql = "select * from employee_payroll";
		List<EmployeePayrollData> employeePayrollDataList = new ArrayList<>();
		try {
			Connection connection = this.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String gender = resultSet.getString("gender");
				double salary = resultSet.getDouble("salary");
				LocalDate start_date = resultSet.getDate("start_date").toLocalDate();
				EmployeePayrollData employeePayrollData = new EmployeePayrollData(id, name, gender, salary, start_date);
				employeePayrollDataList.add(employeePayrollData);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employeePayrollDataList;
	}

	private Connection getConnection() throws SQLException {
		String jdbcURL = "jdbc:mysql://localhost:3306/employee_payroll_service?useSSL=false";
		String userName = "root";
		String password = "password";
		Connection connection = null;
		System.out.println("Connecting to database " + jdbcURL);
		connection = DriverManager.getConnection(jdbcURL, userName, password);
		System.out.println("Connection is successful!!!" + connection);
		return connection;
	}
}