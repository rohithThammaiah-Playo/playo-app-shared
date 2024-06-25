package com.techmash.playo.shared.trainer.models.responses

data class ServiceDetails(
    val _id: String,
    val active: Boolean,
    val categoryType: String,
    val coverImage: String,
    val searchIndexes: List<String>,
    val serviceId: String,
    val serviceImage: String,
    val serviceName: String,
    val serviceSectionImage: String,
)