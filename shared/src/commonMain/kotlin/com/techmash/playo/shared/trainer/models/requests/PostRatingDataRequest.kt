package com.techmash.playo.shared.trainer.models.requests

data class PostRatingDataRequest(
    val review: Review,
    val trainerId: String,
    val userId: String,
)

data class Review(
    val rating: Int,
    val review: String,
)