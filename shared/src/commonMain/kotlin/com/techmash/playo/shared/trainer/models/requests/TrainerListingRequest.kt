package com.techmash.playo.shared.trainer.models.requests

import com.techmash.playo.shared.network.PlayoResponse
import com.techmash.playo.shared.trainer.models.responses.Trainer
import com.techmash.playo.shared.trainer.models.responses.TrainerSearchDTO
import com.techmash.playo.shared.trainer.models.responses.TrainerDetailsDTO
import com.techmash.playo.shared.trainer.models.responses.TrainerHomeDTO
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TrainerListingRequest(
    @SerialName("userId")
    val userId: String,

    @SerialName("services")
    val services: List<String>? = emptyList(),

    @SerialName("type")
    val type: String? = TrainerListingType.ALL.value,

    @SerialName("sortBy")
    val sortBy: Int? = 2,

    @SerialName("page")
    val page: Int,
)

@Serializable
data class TrainerListingResponse(
    val data: TrainerListingDTO,
    override val message: String?,
    override val requestStatus: Int? = null,
    override val currentPage: Int? = null,
    override val nextPage: Int? = null,
) : PlayoResponse

@Serializable
data class TrainerListingDTO(
    val nextPage: Int,
    val trainerList: List<Trainer>,
)

@Serializable
data class TrainerDetailResponse(
    val data: TrainerDetailsDTO,
    override val message: String?,
    override val requestStatus: Int?,
    override val currentPage: Int?,
    override val nextPage: Int?,
) : PlayoResponse

@Serializable
data class TrainerSearchResponse(
    val data: TrainerSearchDTO,
    override val message: String?,
    override val requestStatus: Int?,
    override val currentPage: Int?,
    override val nextPage: Int?,
) : PlayoResponse

@Serializable
data class TrainerHomeDataResponse(
    val data: TrainerHomeDTO,
    override val message: String?,
    override val requestStatus: Int?,
    override val currentPage: Int?,
    override val nextPage: Int?,
) : PlayoResponse

enum class TrainerListingType(val value: String) {
    FEATURED("featured"),
    ALL("all"),
    ACADEMY("academy"),
    INDIVIDUAL("individual"),
}