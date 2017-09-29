package com.spboot.jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spboot.jpa.model.Course;



public interface CourseRepository extends CrudRepository<Course, String>{
	
	public List<Course> findByTopicId(String topicId);
	
	//public List<Course> getCoursesByName(String name);
	//public List<Course> findByDescription(String description);

}
