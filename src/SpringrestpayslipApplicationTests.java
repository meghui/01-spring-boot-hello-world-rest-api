package com.meghui.springrestpayslip;

import com.meghui.springrestpayslip.utils.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class SpringrestpayslipApplicationTests {

	Calculator calculator;

	@BeforeEach
	void setUp () {
		calculator = new Calculator();
	}

	@Test
	@DisplayName("Tax for Salary in band 1 should work.")
	void testBand1() throws Exception {
		assertEquals(0, calculator.calIncomeTax(18200), "Band 1 should work");
	}

	@Test
	@DisplayName("Tax for Salary in band 2 should work.")
	void testBand2() throws Exception {
		assertEquals(298, calculator.calIncomeTax(37000), "Band 2 should work");
	}

	@Test
	@DisplayName("Tax for Salary in band 3 should work.")
	void testBand3 () throws Exception {
		assertEquals(922, calculator.calIncomeTax(60050), "Band 3 should work");
	}

	@Test
	@DisplayName("Tax for Salary in band 4 should work.")
	void testBand4 () throws Exception {
		assertEquals(2669, calculator.calIncomeTax(120000), "Band 4 should work");
	}

	@Test
	@DisplayName("Tax for Salary in band 5 should work.")
	void testBand5 () throws Exception {
		assertEquals(5269, calculator.calIncomeTax(200000), "Band 5 should work");
	}

	@Test
	public void contextLoads() {
		assertTrue(true);
	}
}
