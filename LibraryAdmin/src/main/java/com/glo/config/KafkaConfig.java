package com.glo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

	
	@KafkaListener(topics="Number-Of-Books",groupId = "one")
	public void getNumberOfBooksInLibrary(String value)
	{
		System.out.println(value);
	}
	
}
