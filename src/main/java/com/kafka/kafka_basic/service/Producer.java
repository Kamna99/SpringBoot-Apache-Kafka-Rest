package com.kafka.kafka_basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	@Autowired
	KafkaTemplate<String, String> kafkatemplate;
	
	public void sendMsgToTopic(String msg) {
		kafkatemplate.send("kafkaRest",msg);
	}
}
