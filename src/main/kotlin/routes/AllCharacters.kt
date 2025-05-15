package com.ycosilvallana.routes

import com.ycosilvallana.models.BaseErrorResponse
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getAllCharacters() {
    get("/onepiece/characters") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            require(page in 1..5)
            call.respond(message = page)
        } catch (e: NumberFormatException) {
            call.respond(
                message = BaseErrorResponse(
                    meta = null,
                    success = false,
                    message = "Invalid page value",
                    errorCode = "",
                    httpStatus = HttpStatusCode.BadRequest.value
                ),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = BaseErrorResponse(
                    meta = null,
                    success = false,
                    message = "Page not found",
                    errorCode = "",
                    httpStatus = HttpStatusCode.NotFound.value
                ),
                status = HttpStatusCode.NotFound
            )
        }
    }
}