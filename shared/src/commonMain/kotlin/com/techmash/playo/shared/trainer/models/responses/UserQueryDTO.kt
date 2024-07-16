package com.techmash.playo.shared.trainer.models.responses

import kotlinx.serialization.Serializable

@Serializable
data class UserQueryDTO(
    val nextPage: Int,
    val userQueries: List<UserQueryList>,
)

@Serializable
data class UserQueryList(
    val queries: Queries,
    val trainerImage: String?,
    val trainerName: String?,
    val trainerId: String?,
    val userId: String?,
    val userName: String?,
    val isAcademy: Boolean?,
)

@Serializable
data class Queries(
    val answerTime: String?,
    val isAnswered: Boolean,
    val isReadByUser: Boolean,
    val queryId: String,
    val queryResponse: String,
    val queryTime: String?,
    val userQuery: String,
)