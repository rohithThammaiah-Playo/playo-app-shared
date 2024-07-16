package com.techmash.playo.shared.trainer.models.responses

import kotlinx.serialization.Serializable

@Serializable
data class TrainerSearchDTO(
    val trainers: List<Trainer>,
)

@Serializable
data class Trainer(
    val address: String,
    val avgRating: Float,
    val fName: String,
    val isAcademy: Boolean,
    val isFeatured: Boolean,
    val lName: String,
    val profilePic: String,
    val ratingCount: Int,
    val services: List<Service>,
    val trainerId: String?,
    val days: List<String>,
    val academyDetails: ListingAcademyDetails?,
)