package com.meghui.springrestpayslip.service;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.meghui.springrestpayslip.entities.Employee;
import com.meghui.springrestpayslip.entities.PaySlip;
import com.meghui.springrestpayslip.utils.Generator;

@RestController
@SpringBootApplication
public class SpringrestpayslipApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringrestpayslipApplication.class, args);
	}
	
	@PostMapping(path = "/payslip")
	public ArrayList<PaySlip> payslippost(@RequestBody ArrayList<Employee> employees) throws Exception {
		ArrayList<PaySlip> paySlips = new ArrayList<>();
		Generator g = new Generator();
		for (Employee emp: employees) {
			paySlips.add(g.generatePaySlip(emp));
		}
		return paySlips;
	}

}
