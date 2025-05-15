package com.ycosilvallana.models

import kotlinx.serialization.Serializable

@Serializable
data class Character(
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val rating: Double,
    val power: Int,
    val month: String,
    val day: String,
    val family: List<String>,
    val abilities: List<String>,
    val natureTypes: List<String>
) {
    companion object {
        fun empty(): Character {
            return Character(
                id = 0,
                name = "",
                image = "",
                about = "",
                rating = 0.0,
                power = 0,
                month = "",
                day = "",
                family = emptyList(),
                abilities = emptyList(),
                natureTypes = emptyList()
            )
        }
    }
}

