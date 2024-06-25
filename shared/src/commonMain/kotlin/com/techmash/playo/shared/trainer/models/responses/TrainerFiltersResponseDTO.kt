package com.techmash.playo.shared.trainer.models.responses

import com.techmash.playo.shared.network.PlayoResponse
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class TrainerFiltersResponseDTO(
    val data: TrainerFilterDataDTO?,

    override val message: String?,
    override val requestStatus: Int? = null,
    override val currentPage: Int? = null,
    override val nextPage: Int? = null,
) : PlayoResponse

@Serializable
data class TrainerFilterDataDTO(
    @SerialName("services")
    val services: TrainerServicesFilterDataDTO?,
)

@Serializable
data class TrainerServicesFilterDataDTO(
    @SerialName("service")
    val service: List<ServiceFilterDTO>?,
    @SerialName("age")
    val ageGroups: List<AgeGroupFilterDTO>?,
    @SerialName("batchType")
    val batches: List<BatchFilterDTO>?,
)

@Serializable
data class BatchFilterDTO(
    val serviceId: String?,
    val serviceName: String?,
    val serviceImage: String?,
    val categoryType: String?,
)

@Serializable
data class AgeGroupFilterDTO(
    val serviceId: String?,
    val serviceName: String?,
    val serviceImage: String?,
    val categoryType: String?,
)

@Serializable
class ServiceFilterDTO(
    val serviceId: String?,
    val serviceName: String?,
    val serviceImage: String?,
    val categoryType: String?,
)