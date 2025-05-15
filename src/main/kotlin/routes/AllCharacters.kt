package com.ycosilvallana.routes

import com.ycosilvallana.models.BaseErrorResponse
import com.ycosilvallana.repository.CharacterRepository
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllCharacters() {
    val characterRepository: CharacterRepository by application.inject()

    get("/onepiece/characters") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            require(page in 1..5)

            val apiResponse = characterRepository.getAllCharacters(page)
            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )
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