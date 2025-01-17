package com.techmash.playo.shared.trainer.models.requests

import com.techmash.playo.shared.network.PlayoResponse
import com.techmash.playo.shared.trainer.models.responses.UserQueryDTO
import com.techmash.playo.shared.trainer.models.responses.ServiceDetailsDTO
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TrainerEnquiryRequest(
    @SerialName("userId")
    val userId: String,

    @SerialName("userName")
    val userName: String,

    @SerialName("userMobile")
    val userMobile: String,

    @SerialName("userEmail")
    val userEmail: String,

    @SerialName("serviceId")
    val serviceId: String,

    @SerialName("trainerId")
    val trainerId: String,

    @SerialName("query")
    val query: String,
)

@Serializable
data class TrainerEnquiryResponse(
    val data: TrainerEnquiryDTO,
    override val message: String?,
    override val requestStatus: Int?,
    override val currentPage: Int?,
    override val nextPage: Int?,
) : PlayoResponse

@Serializable
data class TrainerEnquiryDTO(
    val userEnquiry: TrainerEnquiry,
)

@Serializable
data class TrainerEnquiry(
    val query: String,
    val serviceId: String,
    val trainerId: String,
    val userEmail: String,
    val userId: String,
    val userMobile: String,
    val userName: String,
)

@Serializable
data class TrainerQueryListResponse(
    val data: UserQueryDTO,
    override val message: String?,
    override val requestStatus: Int?,
    override val currentPage: Int?,
    override val nextPage: Int?,
) : PlayoResponse

@Serializable
data class ServiceDetailResponse(
    val data: ServiceDetailsDTO,
    override val message: String?,
    override val requestStatus: Int?,
    override val currentPage: Int?,
    override val nextPage: Int?,
) : PlayoResponse