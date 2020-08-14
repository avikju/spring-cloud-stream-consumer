package com.avik.cloud.stream.consumer;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import com.avik.cloud.stream.consumer.model.Book;

@SpringBootApplication
@EnableBinding(Sink.class)
public class SpringCloudStreamConsumer {

	Logger logger=org.slf4j.LoggerFactory.getLogger(SpringCloudStreamConsumer.class);
	
	public static void main(String[] args) {
		
		SpringApplication.run(SpringCloudStreamConsumer.class, args);

	}
	
	@StreamListener("input")
	public void consumeMessage(Book book) {
		logger.info("Consumed message>>"+book);
	}

}
