package com.inn.cafe.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inn.cafe.POJO.Feedback;
import com.inn.cafe.wrapper.FeedbackWrapper;

@RestController
@RequestMapping("/feedback")
public interface FeedbackRest {

		@PostMapping
	    public ResponseEntity<Feedback> saveFeedback(@RequestBody Feedback feedback); 

	    @GetMapping
	    public ResponseEntity<List<FeedbackWrapper>> getAllFeedback(); 
	

}
