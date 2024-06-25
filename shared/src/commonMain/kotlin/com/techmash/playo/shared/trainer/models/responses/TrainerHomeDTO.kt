package com.techmash.playo.shared.trainer.models.responses

data class TrainerHomeDTO(
    val banners: List<BannersMetadataDTO>,
    val servicesInCity: List<ServicesInCity?>,
    val stripBanner: StripBanner,
    val unreadQueriesCount: Int,
)

data class ServicesInCity(
    val serviceId: String?,
    val serviceName: String?,
    val serviceSectionImage: String?,
)

data class StripBanner(
    val description: String,
    val imageUrl: String,
    val redirectLink: String,
)

data class BannersMetadataDTO(
    val redirectLink: String,
    val id: String,
    val imageUrl: String,
    val description: String,
)
