package com.blz;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.blz.EmployeePayrollService.IOSevice;

public class EmployeePayrollServiceTest {
	@Test
	public void givenEmployeePayrollInDB_WhenRetrived_ShouldMatchEmployeeCount() {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		List<EmployeePayrollData> employeePayrollData = employeePayrollService.readEmployeePayrollData(IOSevice.DB_IO);
		Assert.assertEquals(3, employeePayrollData.size());
	}

}
