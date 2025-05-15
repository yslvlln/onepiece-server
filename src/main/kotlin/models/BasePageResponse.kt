package com.ycosilvallana.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
open class BasePageResponse<T>(
    @SerialName("data") val data: T,
    @SerialName("success") val success: Boolean,
    @SerialName("message") val message: String,
    @SerialName("http_status") val httpStatus: Int,
    @SerialName("meta") val meta: PagingMeta
)

@Serializable
data class PagingMeta(
    @SerialName("current_page")
    val currentPage: Int = 1,
    @SerialName("last_page")
    val lastPage: Int? = null,
    @SerialName("total")
    val total: Int? = null
)