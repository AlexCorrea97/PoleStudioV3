package com.example.polestudiov3.ui.screen.login

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.polestudiov3.ui.LoginScreen
import com.example.polestudiov3.ui.theme.PoleStudioV3Theme

@Composable
fun calendarLoginScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text


        = "Calendar Login")












    }
}

@Preview(showBackground = true)
@Composable
fun CalendarLoginScreenPreview(){
    PoleStudioV3Theme {
        calendarLoginScreen(navController = rememberNavController())
    }
}