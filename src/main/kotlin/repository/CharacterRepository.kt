package com.ycosilvallana.repository

import com.ycosilvallana.models.BasePageResponse
import com.ycosilvallana.models.Character

interface CharacterRepository {

    val heroes: Map<Int, List<Character>>

    val page1: List<Character>
    val page2: List<Character>
    val page3: List<Character>
    val page4: List<Character>
    val page5: List<Character>

    suspend fun getAllCharacters(page: Int = 1): BasePageResponse<List<Character>>
    suspend fun searchCharacter(name: String): BasePageResponse<List<Character>>
}