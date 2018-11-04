package com.jpa.test.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@Autowired
	private ConsumerService consumerService;
	
	
	@RequestMapping(value="/testconsumer", method=RequestMethod.POST)
	public ResponseEntity<String> insertConsumer(@RequestBody Consumer consumer) {
		int id = consumerService.saveConsumer(consumer);
		
		return new ResponseEntity<>("Good"+id, HttpStatus.CREATED);
	}
}
