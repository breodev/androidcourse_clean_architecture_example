package com.example.cleanarchitectureexample.domain.usecase

import com.example.cleanarchitectureexample.data.repository.UserRepository
import com.example.cleanarchitectureexample.domain.model.User

class GetUserUseCaseImpl(private val userRepository: UserRepository) : GetUserUseCase {
    override suspend fun execute(userId: Int): User {
        return userRepository.getUserById(userId)
    }
}