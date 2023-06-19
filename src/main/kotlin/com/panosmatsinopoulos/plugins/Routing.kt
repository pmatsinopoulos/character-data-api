package com.panosmatsinopoulos.plugins

import com.panosmatsinopoulos.FantasyName
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.http.ContentType

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText(FantasyName.character(), ContentType.Text.Plain)
        }
    }
}
