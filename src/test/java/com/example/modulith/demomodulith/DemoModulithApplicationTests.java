package com.example.modulith.demomodulith;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class DemoModulithApplicationTests {

	@Test
	void contextLoads() {
		ApplicationModules.of(DemoModulithApplication.class).verify();
	}


}
