package com.techmash.playo.shared.trainer.models.responses

import kotlinx.serialization.Serializable

@Serializable
data class TrainerHomeDTO(
    val banners: List<BannersMetadataDTO>,
    val servicesInCity: List<ServicesInCity?>,
    val stripBanner: StripBanner,
    val unreadQueriesCount: Int,
)

@Serializable
data class ServicesInCity(
    val serviceId: String?,
    val serviceName: String?,
    val serviceSectionImage: String?,
)

@Serializable
data class StripBanner(
    val description: String,
    val imageUrl: String,
    val redirectLink: String,
)

@Serializable
data class BannersMetadataDTO(
    val redirectLink: String,
    val id: String,
    val imageUrl: String,
    val description: String,
)
