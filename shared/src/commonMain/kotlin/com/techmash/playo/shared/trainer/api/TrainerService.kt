package com.techmash.playo.shared.trainer.api

import com.techmash.playo.shared.network.GenericResponse
import com.techmash.playo.shared.trainer.models.requests.PostRatingDataRequest
import com.techmash.playo.shared.trainer.models.requests.ServiceDetailResponse
import com.techmash.playo.shared.trainer.models.requests.TrainerDetailResponse
import com.techmash.playo.shared.trainer.models.requests.TrainerEnquiryRequest
import com.techmash.playo.shared.trainer.models.requests.TrainerEnquiryResponse
import com.techmash.playo.shared.trainer.models.requests.TrainerHomeDataResponse
import com.techmash.playo.shared.trainer.models.requests.TrainerListingRequest
import com.techmash.playo.shared.trainer.models.requests.TrainerListingResponse
import com.techmash.playo.shared.trainer.models.requests.TrainerQueryListResponse
import com.techmash.playo.shared.trainer.models.requests.TrainerSearchResponse
import com.techmash.playo.shared.trainer.models.responses.MarkQueryAsReadRequest
import com.techmash.playo.shared.trainer.models.responses.TrainerFiltersResponseDTO
import com.techmash.playo.shared.trainer.models.responses.TrainerRatingsResponse
import com.techmash.playo.shared.trainer.models.responses.TrainerTestimonialsResponse

interface TrainerService {

    suspend fun getTrainerListing(request: TrainerListingRequest): TrainerListingResponse

    suspend fun getTrainerDetails(
        trainerId: String,
        userId: String,
    ): TrainerDetailResponse

    suspend fun searchTrainer(searchText: String): TrainerSearchResponse

    suspend fun getTrainerHomeData(userId: String): TrainerHomeDataResponse

    suspend fun sendEnquiryToTrainer(request: TrainerEnquiryRequest): TrainerEnquiryResponse

    suspend fun getTrainerFilters(): TrainerFiltersResponseDTO

    suspend fun getTrainerQueries(userId: String): TrainerQueryListResponse

    suspend fun getTrainerTestimonials(trainerId: String): TrainerTestimonialsResponse

    suspend fun markQueryAsRead(request: MarkQueryAsReadRequest): GenericResponse

    suspend fun getServiceDetails(serviceId: String): ServiceDetailResponse

    suspend fun getTrainerRatings(
        trainerId: String,
        userId: String,
    ): TrainerRatingsResponse

    suspend fun postTrainerRating(request: PostRatingDataRequest): GenericResponse

    suspend fun updateTrainerRating(request: PostRatingDataRequest): GenericResponse
}

