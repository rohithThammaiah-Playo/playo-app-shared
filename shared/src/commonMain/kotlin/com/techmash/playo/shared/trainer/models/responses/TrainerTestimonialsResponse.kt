package com.techmash.playo.shared.trainer.models.responses

import com.techmash.playo.shared.network.PlayoResponse
import kotlinx.serialization.Serializable

@Serializable
data class TrainerTestimonialsResponse(
    val data: TrainerTestimonialsDTO,
    override val message: String?,
    override val requestStatus: Int?,
    override val currentPage: Int?,
    override val nextPage: Int?,
) : PlayoResponse

@Serializable
data class TrainerTestimonialsDTO(
    val testimonials: List<Testimonials>,
)

@Serializable
data class Testimonials(
    val id: String,
    val isTestimonial: Boolean?,
    val rating: Float?,
    val ratingDate: String?,
    val review: String?,
    val trainerId: String?,
    val userId: String?,
    val userImage: String?,
    val userName: String?,
)

@Serializable
data class MarkQueryAsReadRequest(
    val queryId: String,
    val userId: String,
)