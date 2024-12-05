package com.example.cleanarchitectureexample.data.repository

import com.example.cleanarchitectureexample.data.datasource.UserDataSource
import com.example.cleanarchitectureexample.data.datasource.UserDataSourceImpl
import com.example.cleanarchitectureexample.domain.usecase.GetUserUseCase
import com.example.cleanarchitectureexample.domain.usecase.GetUserUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideUserDataSource(): UserDataSource {
        return UserDataSourceImpl()
    }

    @Provides
    @Singleton
    fun provideUserRepository(userDataSource: UserDataSource): UserRepository {
        return UserRepositoryImpl(userDataSource)
    }

    @Provides
    fun provideGetUserUseCase(userRepository: UserRepository): GetUserUseCase {
        return GetUserUseCaseImpl(userRepository)
    }
}