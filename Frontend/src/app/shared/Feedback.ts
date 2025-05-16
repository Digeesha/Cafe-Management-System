export interface Feedback {
  id?: number; // Optional since it will be assigned by the backend
  productId: number; // ID of the product the feedback is for
  userId: number; // ID of the user providing the feedback
  rating: number; // Rating given by the user (1 to 5)
  comment: string; // Feedback comment
  createdAt?: string; // Optional; timestamp when the feedback was created
}
