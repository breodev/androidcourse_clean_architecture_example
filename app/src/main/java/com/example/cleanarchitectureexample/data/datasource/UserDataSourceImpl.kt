package com.example.cleanarchitectureexample.data.datasource

import com.example.cleanarchitectureexample.domain.model.User
import kotlinx.coroutines.delay

class UserDataSourceImpl : UserDataSource {

    private val users = listOf(
        User(id = 1, name = "Alice Johnson", email = "alice@example.com"),
        User(id = 2, name = "Bob Smith", email = "bob@example.com"),
        User(id = 3, name = "Charlie Davis", email = "charlie@example.com")
    )

    override suspend fun fetchUser(userId: Int): User {
        delay(1000) // Simulate network delay
        return users.find { it.id == userId } ?: throw Exception("User not found")
    }
}