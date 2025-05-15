package com.ycosilvallana.repository

import com.ycosilvallana.models.BaseResponse
import com.ycosilvallana.models.Character

class CharacterRepositoryImpl: CharacterRepository {

    override val heroes: Map<Int, List<Character>>
        get() = TODO("Not yet implemented")
    override val page1: List<Character>
        get() = TODO("Not yet implemented")
    override val page2: List<Character>
        get() = TODO("Not yet implemented")
    override val page3: List<Character>
        get() = TODO("Not yet implemented")
    override val page4: List<Character>
        get() = TODO("Not yet implemented")
    override val page5: List<Character>
        get() = TODO("Not yet implemented")

    override suspend fun getAllHeroes(page: Int): BaseResponse<List<Character>> {
        TODO("Not yet implemented")
    }

    override suspend fun searchHeroes(name: String): BaseResponse<List<Character>> {
        TODO("Not yet implemented")
    }

}