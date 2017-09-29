package com.spboot.jpa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spboot.jpa.model.Topic;
import com.spboot.jpa.repository.TopicRepository;

@Service
public class TopicService {
	
	
	
	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {

		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add); // method references in
														// lambda expressions
		return topics;
	}

	public Topic getTopic(String id) {

		return topicRepository.findOne(id);

	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);// it will work as update if already there

	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);

	}

}
