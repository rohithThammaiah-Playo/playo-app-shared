package com.techmash.playo.shared.trainer.models.responses

import com.techmash.playo.shared.network.PlayoResponse
import kotlinx.serialization.Serializable

@Serializable
data class TrainerRatingsResponse(
    val data: TrainerRatingDTO,
    override val message: String?,
    override val requestStatus: Int?,
    override val currentPage: Int?,
    override val nextPage: Int?,
) : PlayoResponse

@Serializable
data class TrainerRatingDTO(
    val rating: Rating?,
    val trainerInfo: TrainerInfo?,
)

@Serializable
data class Rating(
    val __v: Int?,
    val _id: String?,
    val id: String?,
    val isTestimonial: Boolean?,
    val rating: Int?,
    val ratingDate: String?,
    val review: String?,
    val trainerId: String?,
    val userId: String?,
    val userImage: String?,
    val userName: String?,
)

@Serializable
data class TrainerInfo(
    val trainerId: String?,
    val trainerImage: String?,
    val trainerName: String?,
    val isAcademy: Boolean?,
    val academyDetails: AcademyInfo?,
)

@Serializable
data class AcademyInfo(
    val academyName: String?,
    val logo: String?,
)
