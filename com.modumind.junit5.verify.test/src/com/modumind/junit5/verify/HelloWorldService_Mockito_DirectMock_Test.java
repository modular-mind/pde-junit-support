package com.modumind.junit5.verify;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class HelloWorldService_Mockito_DirectMock_Test {

	@Test
	void test() {
		HelloWorldService helloWorldService = mock(HelloWorldService.class);
		when(helloWorldService.sayHello()).thenReturn("Hello!");

		assertEquals("Hello!", helloWorldService.sayHello());
	}
}
