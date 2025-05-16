package com.inn.cafe.restImpl;

import com.inn.cafe.POJO.Feedback;
import com.inn.cafe.dao.FeedbackDao;
import com.inn.cafe.rest.FeedbackRest;
import com.inn.cafe.service.FeedbackService;
import com.inn.cafe.wrapper.FeedbackWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeedbackRestImpl implements FeedbackRest {
    @Autowired
    FeedbackService feedbackService;

    @Autowired
    FeedbackDao feedbackDao;
   

    @PostMapping
    public ResponseEntity<Feedback> saveFeedback(@RequestBody Feedback feedback) {
        Feedback savedFeedback = feedbackService.saveFeedback(feedback);
        return ResponseEntity.ok(savedFeedback);
    }

    @GetMapping
    public ResponseEntity<List<FeedbackWrapper>> getAllFeedback() {
        return ResponseEntity.ok(feedbackService.getAllFeedback());
    }

   
}
