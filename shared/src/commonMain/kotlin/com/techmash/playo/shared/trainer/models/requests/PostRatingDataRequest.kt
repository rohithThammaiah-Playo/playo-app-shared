package com.techmash.playo.shared.trainer.models.requests

import kotlinx.serialization.Serializable

@Serializable
data class PostRatingDataRequest(
    val review: Review,
    val trainerId: String,
    val userId: String,
)

@Serializable
data class Review(
    val rating: Int,
    val review: String,
)