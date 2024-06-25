package com.techmash.playo.shared.trainer.api

import com.techmash.playo.shared.network.GenericResponse
import com.techmash.playo.shared.network.httpClient
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
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.client.request.patch
import io.ktor.client.request.post
import io.ktor.client.request.setBody

class TrainerServiceImpl: TrainerService {
    override suspend fun getTrainerListing(request: TrainerListingRequest): TrainerListingResponse {
        return httpClient
            .post("/trainer/list") {
                setBody(request)
            }
            .body()
    }

    override suspend fun getTrainerDetails(
        trainerId: String,
        userId: String
    ): TrainerDetailResponse {
        return httpClient
            .get("/trainer/details") {
                parameter("trainerId", trainerId)
                parameter("userId", userId)
            }
            .body()
    }

    override suspend fun searchTrainer(searchText: String): TrainerSearchResponse {
        return httpClient
            .get("/trainer/search") {
                parameter("searchQuery", searchText)
            }.body()
    }

    override suspend fun getTrainerHomeData(userId: String): TrainerHomeDataResponse {
        return httpClient
            .get("/trainer/home") {
                parameter("userId", userId)
            }.body()
    }

    override suspend fun sendEnquiryToTrainer(request: TrainerEnquiryRequest): TrainerEnquiryResponse {
        return httpClient
            .post("/user/trainer/enquiry") {
                setBody(request)
            }.body()
    }

    override suspend fun getTrainerFilters(): TrainerFiltersResponseDTO {
        return httpClient
            .get("/trainer/service/all")
            .body()
    }

    override suspend fun getTrainerQueries(userId: String): TrainerQueryListResponse {
        return httpClient
            .get("/trainer/user/queries" ) {
                parameter("userId", userId)
            }.body()

    }

    override suspend fun getTrainerTestimonials(trainerId: String): TrainerTestimonialsResponse {
        return httpClient
            .get("/trainer/testimonials") {
                parameter("trainerId", trainerId)
            }.body()
    }

    override suspend fun markQueryAsRead(request: MarkQueryAsReadRequest): GenericResponse {
        return httpClient
            .post("/trainer/read/query") {
                setBody(request)
            }.body()
    }

    override suspend fun getServiceDetails(serviceId: String): ServiceDetailResponse {
        return httpClient
            .get("/trainer/service/details") {
                parameter("serviceId", serviceId)
            }.body()
    }

    override suspend fun getTrainerRatings(trainerId: String, userId: String): TrainerRatingsResponse {
        return httpClient
            .get("/trainer/review") {
                parameter("trainerId", trainerId)
                parameter("userId", userId)
            }.body()
    }

    override suspend fun postTrainerRating(request: PostRatingDataRequest): GenericResponse {
        return httpClient
            .post("/trainer/review") {
                setBody(request)
            }.body()
    }

    override suspend fun updateTrainerRating(request: PostRatingDataRequest): GenericResponse {
        return httpClient
            .patch("/trainer/review") {
                setBody(request)
            }.body()
    }

}