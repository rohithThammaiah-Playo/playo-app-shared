package com.techmash.playo.shared.trainer.models.responses

import kotlinx.serialization.Serializable

@Serializable
data class TrainerDetailsDTO(
    val trainerDetails: TrainerDetails,
)

@Serializable
data class TrainerDetails(
    val bio: String?,
    val about: String?,
    val active: Boolean?,
    val address: String?,
    val alreadyEnquired: Boolean?,
    val avgRating: Double?,
    val certifications: List<Certifications>? = emptyList(),
    val cityCode: Int?,
    val countryCode: String?,
    val createdAt: String?,
    val description: String?,
    val email: String?,
    val fName: String?,
    val gallery: List<String>?,
    val id: String?,
    val isAcademy: Boolean?,
    val isFeatured: Boolean?,
    val isListed: Boolean?,
    val lName: String?,
    val location: Location?,
    val managerId: String?,
    val online: Boolean?,
    val phone: String?,
    val pricingText: String?,
    val profileCompletion: Int?,
    val profilePic: String?,
    val profileVerified: Boolean?,
    val ratingCount: Int?,
    val searchIndex: List<String>? = emptyList(),
    val services: List<Service>? = emptyList(),
    val shareLink: String?,
    val userLeadsCount: Int?,
    val userQuery: UserQuery?,
    val days: List<String>?,
    val academyDetails: AcademyDetails?,
)

@Serializable
data class AcademyDetails(
    val academyName: String?,
    val coaches: List<AcademyDetailCoaches>?,
    val logo: String?,
)

@Serializable
data class ListingAcademyDetails(
    val academyName: String?,
    val coaches: List<Coaches>?,
    val logo: String?,
)

@Serializable
data class Coaches(
    val certifications: List<Certifications>,
    val coachDescription: String,
    val coachImage: String,
    val coachName: String,
    val coachRole: String,
    val id: String,
    val services: List<String>,
)

@Serializable
data class AcademyDetailCoaches(
    val certifications: List<Certifications>,
    val coachDescription: String,
    val coachImage: String,
    val coachName: String,
    val coachRole: String,
    val id: String,
    val services: List<Service>?,
)

@Serializable
data class UserQuery(
    val isAnswered: Boolean?,
    val queryId: String?,
    val queryResponse: String?,
    val userQuery: String?,
    val queryTime: String?,
    val answerTime: String?,
    val isReadByUser: Boolean?,
)

@Serializable
data class Service(
    val categoryType: String?,
    val serviceId: String?,
    val serviceImage: String?,
    val serviceName: String?,
)

@Serializable
data class Location(
    val coordinates: List<Double>?,
    val type: String?,
)

@Serializable
data class Certifications(
    val certificateImage: String?,
    val description: String?,
    val _id: String?,
)