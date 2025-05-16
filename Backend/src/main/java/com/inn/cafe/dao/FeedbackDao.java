package com.inn.cafe.dao;

import com.inn.cafe.POJO.Feedback;
import com.inn.cafe.wrapper.FeedbackWrapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FeedbackDao extends JpaRepository<Feedback, Long> {
	@Query("SELECT new com.inn.cafe.wrapper.FeedbackWrapper(f.id, f.product.id, f.product.name, f.user.id, f.user.name, f.rating, f.comment, f.createdAt) " +
		       "FROM Feedback f " +
		       "JOIN f.product p " +
		       "JOIN f.user u")
    List<FeedbackWrapper> getAllFeedback();

}
