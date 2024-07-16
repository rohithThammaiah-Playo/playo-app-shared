package com.techmash.playo.shared.trainer.models.responses

import kotlinx.serialization.Serializable

@Serializable
data class ServiceDetailsDTO(
    val serviceDetails: ServiceDetails,
)