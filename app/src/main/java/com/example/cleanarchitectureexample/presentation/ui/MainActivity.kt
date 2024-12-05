package com.example.cleanarchitectureexample.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.cleanarchitectureexample.presentation.viewmodel.UserViewModel
import com.example.cleanarchitectureexample.presentation.viewmodel.UserViewModelFactory
import com.example.cleanarchitectureexample.data.datasource.UserDataSourceImpl
import com.example.cleanarchitectureexample.data.repository.UserRepositoryImpl
import com.example.cleanarchitectureexample.domain.usecase.GetUserUseCaseImpl

class MainActivity : ComponentActivity() {

    private val userViewModel: UserViewModel by viewModels {
        UserViewModelFactory(GetUserUseCaseImpl(UserRepositoryImpl(UserDataSourceImpl())))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserProfileApp(userViewModel)
        }
    }
}