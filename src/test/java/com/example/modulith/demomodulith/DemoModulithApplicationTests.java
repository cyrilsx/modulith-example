package com.example.modulith.demomodulith;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

@SpringBootTest
class DemoModulithApplicationTests {

	private final ApplicationModules applicationModules = ApplicationModules.of(DemoModulithApplication.class);

	@Test
	void contextLoads() {
		applicationModules.verify();
	}

	@Test
	void writeDocumentationSnippets() {
		new Documenter(applicationModules)
				.writeModulesAsPlantUml()
				.writeIndividualModulesAsPlantUml();
	}
}
