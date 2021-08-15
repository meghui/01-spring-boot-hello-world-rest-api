package com.meghui.springrestpayslip.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meghui.springrestpayslip.entities.Employee;
import com.meghui.springrestpayslip.entities.PaySlip;
import com.meghui.springrestpayslip.utils.Generator;

@RestController
public class SpringrestpayslipController {
	
	@PostMapping (path = "/payslip")
	public ArrayList<PaySlip> payslippost (ArrayList<Employee> employees) throws Exception {
		Generator gtor = new Generator();
		ArrayList<PaySlip> slips = new ArrayList<>();
		for (Employee emp : employees) {
			slips.add(gtor.generatePaySlip(emp));
		}
		return slips;
	}
}
