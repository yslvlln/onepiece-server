package com.ycosilvallana

import com.ycosilvallana.plugins.configureDefaultHeader
import com.ycosilvallana.plugins.configureKoin
import com.ycosilvallana.plugins.configureMonitoring
import com.ycosilvallana.plugins.configureRouting
import com.ycosilvallana.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureKoin()
    configureSerialization()
    configureMonitoring()
    configureRouting()
    configureDefaultHeader()
}
