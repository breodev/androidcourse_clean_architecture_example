package com.example.cleanarchitectureexample.data.repository

import com.example.cleanarchitectureexample.domain.model.User
import com.example.cleanarchitectureexample.data.datasource.UserDataSource

class UserRepositoryImpl(private val userDataSource: UserDataSource) : UserRepository {
    override suspend fun getUserById(userId: Int): User {
        return userDataSource.fetchUser(userId)
    }
}