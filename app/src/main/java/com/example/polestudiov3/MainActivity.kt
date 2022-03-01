package com.example.polestudiov3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.polestudiov3.ui.LoginScreen
import com.example.polestudiov3.ui.screen.login.calendarLoginScreen
import com.example.polestudiov3.ui.theme.PoleStudioV3Theme
import com.example.polestudiov3.viewmodel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.util.*

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val loginViewModel:LoginViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
        //loginViewModel.getUserModel()
        loginViewModel._modelUser.observe(this, androidx.lifecycle.Observer {
            println(it?.user?.name)
        })
    }
}

