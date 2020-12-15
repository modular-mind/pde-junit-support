package com.modumind.junit5.verify;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class HelloWorldService_Mockito_MockWithInit_Test {

	@Mock
	private HelloWorldService helloWorldService;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void test() {
		when(helloWorldService.sayHello()).thenReturn("Hello!");
		assertEquals("Hello!", helloWorldService.sayHello());
	}
}
