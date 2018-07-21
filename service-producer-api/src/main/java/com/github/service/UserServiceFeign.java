package com.github.service;

import com.github.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  service-producer
 */
public interface UserServiceFeign {

	@RequestMapping("hello")
	String hello();

	@GetMapping("{id}")
	User getUser(@PathVariable("id") Integer id);

}

