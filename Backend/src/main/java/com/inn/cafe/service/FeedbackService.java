package com.inn.cafe.service;

import com.inn.cafe.POJO.Feedback;
import com.inn.cafe.wrapper.FeedbackWrapper;


import java.util.List;


public interface FeedbackService {
	
	public Feedback saveFeedback(Feedback feedback);
	  public List<FeedbackWrapper> getAllFeedback();
	


	 
	
}
