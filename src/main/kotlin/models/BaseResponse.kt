package com.ycosilvallana.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BaseResponse<T>(
    @SerialName("data") val data: T,
    @SerialName("success") val success: Boolean = false,
    @SerialName("message") val message: String = "",
    @SerialName("error_code") val errorCode: String = "",
    @SerialName("http_status") val httpStatus: Int = 500
)