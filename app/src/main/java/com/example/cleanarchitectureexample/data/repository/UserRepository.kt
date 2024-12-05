package com.example.cleanarchitectureexample.data.repository

import com.example.cleanarchitectureexample.domain.model.User

interface UserRepository {
    suspend fun getUserById(userId: Int): User
}