package com.kafka.kafka_basic.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics="kafkaRest", groupId="Group1")
	public void listenToTopic(String message) {
		System.out.println("The received message "+message);
	}
}
