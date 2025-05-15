package com.ycosilvallana.plugins

import com.ycosilvallana.routes.getAllCharacters
import com.ycosilvallana.routes.root
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        root()
        getAllCharacters()
        staticResources(
            remotePath = "/images",
            basePackage = "images"
        )
    }
}
