package com.modumind.junit5.verify;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void testSayHello() {
		HelloWorld helloWorld = new HelloWorld();
		assertEquals("Hello!", helloWorld.sayHello());
	}
}
