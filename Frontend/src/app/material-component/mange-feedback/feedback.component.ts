import { Component, OnInit } from '@angular/core';
import { FeedbackService } from 'src/app/services/feedback.service';
import { Feedback } from 'src/app/shared/Feedback';


@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.css'],
})
export class FeedbackComponent implements OnInit {products: any[] = []; // List of products fetched from the backend
  feedbackList: any[] = []; // List of feedback
  feedback: Feedback = {
    productId: 0,
    userId: 1, // Example user ID, replace with logged-in user's ID
    rating: 0,
    comment: '',
  };
  selectedProductId: number | null = null; // For fetching feedback by product
  message = ''; // Message to display after form submission

  constructor(private feedbackService: FeedbackService) {}

  ngOnInit(): void {
    this.loadProducts();
    this.loadAllFeedback(); // Fetch all feedback on initialization
  }

  // Fetch products from the backend
  loadProducts(): void {
    this.feedbackService.getProducts().subscribe(
      (data) => {
        this.products = data;
      },
      (error) => {
        console.error('Error fetching products:', error);
      }
    );
  }

  // Submit feedback to the backend
  submitFeedback(): void {
    if (
      !this.feedback.productId ||
      !this.feedback.rating ||
      !this.feedback.comment
    ) {
      this.message = 'Please fill out all fields.';
      return;
    }

    this.feedbackService.submitFeedback(this.feedback).subscribe(
      (response) => {
        this.message = 'Feedback submitted successfully!';
         // Refresh feedback for the selected product
        this.resetForm();
      },
      (error) => {
        console.error('Error submitting feedback:', error);
        this.message = 'An error occurred. Please try again.';
      }
    );
  }

  // Fetch all feedback
  loadAllFeedback(): void {
    this.feedbackService.getAllFeedback().subscribe(
      (data) => {
        this.feedbackList = data;
      },
      (error) => {
        console.error('Error fetching feedback:', error);
      }
    );
  }

  // Reset form after successful submission
  resetForm(): void {
    this.feedback = {
      productId: 0,
      userId: 1, // Reset with logged-in user ID
      rating: 0,
      comment: '',
    };
  }
}
