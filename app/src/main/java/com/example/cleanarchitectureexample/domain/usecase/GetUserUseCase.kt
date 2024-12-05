package com.example.cleanarchitectureexample.domain.usecase

import com.example.cleanarchitectureexample.domain.model.User

interface GetUserUseCase {
    suspend fun execute(userId: Int): User
}
