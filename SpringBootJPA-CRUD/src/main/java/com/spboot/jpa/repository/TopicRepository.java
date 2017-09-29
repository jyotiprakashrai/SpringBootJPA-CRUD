package com.spboot.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.spboot.jpa.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
