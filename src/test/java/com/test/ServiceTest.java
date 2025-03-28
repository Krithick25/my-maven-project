package com.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.Service;

public class ServiceTest {
	@Test
	public void TestEmailOne() {
		Service service = new Service();
		assertTrue(service.validateEmail("krithick@gmail.com"));
	}
	
	@Test
	public void TestEmailTwo() {
		Service service = new Service();
		assertFalse(service.validateEmail("krithickgmail.com"));
	}
}