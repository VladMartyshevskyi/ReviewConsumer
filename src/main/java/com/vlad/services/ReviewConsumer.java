package com.vlad.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.vlad.dao.Review;
import com.vlad.dao.repository.ReviewRepository;

@Service
public class ReviewConsumer {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	private Gson gson = new Gson();
	
	@KafkaListener(topics = "${kafka.topic}")
	public void listen(@Payload String message) {
		reviewRepository.save(gson.fromJson(message, Review.class));
	}

}
