package com.ycosilvallana.repository

import com.ycosilvallana.models.BaseResponse
import com.ycosilvallana.models.Character

interface CharacterRepository {

    val heroes: Map<Int, List<Character>>

    val page1: List<Character>
    val page2: List<Character>
    val page3: List<Character>
    val page4: List<Character>
    val page5: List<Character>

    suspend fun getAllHeroes(page: Int = 1): BaseResponse<List<Character>>
    suspend fun searchHeroes(name: String): BaseResponse<List<Character>>
}