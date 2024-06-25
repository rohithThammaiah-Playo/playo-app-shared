package com.techmash.playo.shared.trainer.models.responses

data class TrainerSearchDTO(
    val trainers: List<Trainer>,
)

data class Trainer(
    val id: String?,
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