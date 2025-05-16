import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Feedback } from '../shared/Feedback'; // Import the Feedback interface

@Injectable({
  providedIn: 'root',
})
export class FeedbackService {
//  private baseUrl = 'http://localhost:8082/feedback'; // Base API endpoint for feedback
  private productUrl = 'http://localhost:8082/product/get'; // Backend endpoint to fetch products
  private feedbackUrl = 'http://localhost:8082/feedback'; // Backend endpoint for feedback
  constructor(private http: HttpClient) {}

  // Fetch all products
  getProducts(): Observable<any[]> {
    return this.http.get<any[]>(this.productUrl);
  }

  // Submit feedback (formatting the request body as required by the backend)
  submitFeedback(feedback: Feedback): Observable<any> {
    const feedbackRequest = {
      product: {
        id: feedback.productId, // Map productId to product.id
      },
      user: {
        id: feedback.userId, // Map userId to user.id
      },
      rating: feedback.rating,
      comment: feedback.comment,
      createdAt: new Date().toISOString(), // Set the current timestamp
    };

    return this.http.post(this.feedbackUrl, feedbackRequest);
  }
  // Fetch all feedback
  getAllFeedback(): Observable<any[]> {
    return this.http.get<any[]>(this.feedbackUrl);
  }


}
