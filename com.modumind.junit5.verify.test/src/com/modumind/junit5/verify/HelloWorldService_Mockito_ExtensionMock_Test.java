package com.modumind.junit5.verify;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HelloWorldService_Mockito_ExtensionMock_Test {

	@Mock
	private HelloWorldService helloWorldService;
	
	@Test
	void test() {
		when(helloWorldService.sayHello()).thenReturn("Hello!");

		assertEquals("Hello!", helloWorldService.sayHello());
	}
}
