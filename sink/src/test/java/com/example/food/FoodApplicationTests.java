package com.example.food;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.StubTrigger;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@AutoConfigureStubRunner(ids = "com.example:publisher:+:stubs:8080")
public class FoodApplicationTests {

	@Autowired
	private StubTrigger stubTrigger;



	@Test
	public void shouldDoSuchAndSuch() {
		stubTrigger.trigger("foods");

	}

}
