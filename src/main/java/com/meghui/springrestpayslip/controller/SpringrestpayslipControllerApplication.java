package com.meghui.springrestpayslip.controller;

import java.util.ArrayList;

import com.meghui.springrestpayslip.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meghui.springrestpayslip.entities.Employee;
import com.meghui.springrestpayslip.entities.PaySlip;

@RestController
@SpringBootApplication
public class SpringrestpayslipControllerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringrestpayslipControllerApplication.class, args);
	}
	
	@PostMapping(path = "/payslip")
	public ArrayList<PaySlip> postPaySlips(@RequestBody ArrayList<Employee> employees) throws Exception {
		ArrayList<PaySlip> paySlips = new ArrayList<>();
		for (Employee emp: employees) {
			paySlips.add(generatePaySlip(emp));
		}
		return paySlips;
	}

	private PaySlip generatePaySlip (Employee employee) throws Exception {

		return getPaySlip(employee);
	}

	public static PaySlip getPaySlip(Employee employee) throws Exception {
		PaySlip paySlip = new PaySlip();

		EmployeeService employeeService = new EmployeeService();

		paySlip.setEmployee(employee);
		paySlip.setPayPeriod(employee.getStartDateOfPayment() + " - " + employeeService.calEndDate(employee.getStartDateOfPayment()));
		paySlip.setGrossIncome(employeeService.calGrossIncome(employee.getAnnualSalary()));
		paySlip.setIncomeTax(employeeService.calIncomeTax(employee.getAnnualSalary()));
		paySlip.setNetIncome(employeeService.calNetIncome(employee.getAnnualSalary()));
		paySlip.setSuperValue(employeeService.calSuper(employee.getAnnualSalary(), employee.getSuperRate()));

		return paySlip;
	}


}

