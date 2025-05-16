package com.inn.cafe.wrapper;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FeedbackWrapper {
	private Long id;
    private Integer productId;
    private String productName;  // Or any other relevant product information
    private Integer userId;
    private String username;  // Or other relevant user information
    private int rating;
    private String comment;
    private LocalDateTime createdAt;
    
	public FeedbackWrapper(Long id, Integer productId, String productName, Integer userId, String username, int rating,
			String comment, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.productId = productId;
		this.productName = productName;
		this.userId = userId;
		this.username = username;
		this.rating = rating;
		this.comment = comment;
		this.createdAt = createdAt;
	}
    
	    }
