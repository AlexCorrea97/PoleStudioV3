package com.example.polestudiov3.ui.navigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.polestudiov3.ui.LoginScreen
import com.example.polestudiov3.ui.screen.login.calendarLoginScreen
import com.example.polestudiov3.viewmodel.LoginViewModel

@Composable
fun navigationLogin(context: Context,viewModel: LoginViewModel) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login"){
        composable("login"){
            LoginScreen(navController = navController, context = context, viewModel)
        }
        composable("calendar"){
            calendarLoginScreen(navController = navController)
        }
    }
}