package com.ycosilvallana.di

import com.ycosilvallana.repository.CharacterRepository
import com.ycosilvallana.repository.CharacterRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<CharacterRepository> {
        CharacterRepositoryImpl()
    }
}