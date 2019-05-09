package com.saran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KakfaSender {
	
	@Autowired
	private KafkaTemplate<String,String> kafka;
	
	String topicName="david-topic";
	
		public void send(String msg){
			kafka.send(topicName,msg);
		}
	

}
