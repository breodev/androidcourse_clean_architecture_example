package com.example.cleanarchitectureexample.data.datasource

import com.example.cleanarchitectureexample.domain.model.User

interface UserDataSource {
    suspend fun fetchUser(userId: Int): User
}