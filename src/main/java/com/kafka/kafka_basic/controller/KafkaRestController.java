package com.kafka.kafka_basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.kafka_basic.service.Producer;

@RestController
@RequestMapping("rest/api")
public class KafkaRestController {

	@Autowired
	Producer producer;
	
	@GetMapping("/producerMsg")
	public void getMessageFromClient(@RequestParam("message") String message) {
		producer.sendMsgToTopic(message);
	}
}
