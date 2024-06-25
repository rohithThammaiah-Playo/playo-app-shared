package com.techmash.playo.shared.network

import kotlin.jvm.JvmField

/**
 * Generic and base response class for all Playo server responses
 *
 * Created by kalyandechiraju on 04/06/18.
 * Playo
 */
interface PlayoResponse {
    val message: String?
    val requestStatus: Int?
    val currentPage: Int?
    val nextPage: Int?

    fun isSuccessful(): Boolean {
        return requestStatus != 0
    }
}

data class GenericResponse(
    override val message: String?,
    override val requestStatus: Int?,
    override val currentPage: Int?,
    override val nextPage: Int?,
) : PlayoResponse

// For use in V1 imported classes
open class GenericPlayoResponse {
    @JvmField
    var message: String? = null

    @JvmField
    var requestStatus: Int = 0

    fun isSuccessful(): Boolean {
        return requestStatus != 0
    }
}

/*open class PlayoResponse {
    var message: String? = null
    var requestStatus: Int? = null
    var currentPage: Int? = null
    var nextPage: Int? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PlayoResponse

        if (message != other.message) return false
        if (requestStatus != other.requestStatus) return false
        if (currentPage != other.currentPage) return false
        if (nextPage != other.nextPage) return false

        return true
    }

    override fun hashCode(): Int {
        var result = message?.hashCode() ?: 0
        result = 31 * result + (requestStatus ?: 0)
        result = 31 * result + (currentPage ?: 0)
        result = 31 * result + (nextPage ?: 0)
        return result
    }

    override fun toString(): String {
        return "PlayoResponse(message='$message', requestStatus=$requestStatus, currentPage=$currentPage, nextPage=$nextPage)"
    }

}*/
