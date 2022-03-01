package com.example.polestudiov3.ui

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.polestudiov3.R
import com.example.polestudiov3.ui.theme.BLACK_MODIFIED
import com.example.polestudiov3.ui.theme.PoleStudioV3Theme
import com.example.polestudiov3.ui.theme.WHITE
import com.example.polestudiov3.viewmodel.LoginViewModel


@Composable
fun LoginScreen(
    navController: NavController,
    context: Context?,
    viewModel: LoginViewModel?
) {
    var user_name by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    PoleStudioV3Theme {
    Box {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.loginfondo),
            contentDescription = "background_image",
            contentScale = ContentScale.FillBounds
        )
        Scaffold(
            //backgroundColor = Color.Transparent
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo_black),
                    contentDescription = "logo black",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 35.dp)
                )

                TextField(
                    placeholder ={ Text(text = "Usuario...", color = Color.Gray)},
                    value = user_name,
                    onValueChange = {
                        user_name = it
                    },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_account_v),
                            contentDescription = "Account", tint = Color.White
                        )
                    },
                    modifier = Modifier
                        .padding(top = 25.dp, start = 20.dp, end = 20.dp)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(50))
                        .background(BLACK_MODIFIED)
                        .align(alignment = Alignment.CenterHorizontally)
                )
                TextField(
                    placeholder ={ Text(text = "Contrasena...", color = Color.Gray)},
                    value = password,
                    onValueChange = {
                        user_name = it
                    },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_key),
                            contentDescription = "Account", tint = Color.White
                        )
                    },
                    modifier = Modifier
                        .padding(top = 25.dp, start = 20.dp, end = 20.dp)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(50))
                        .background(BLACK_MODIFIED)
                        .align(alignment = Alignment.CenterHorizontally)
                )
                Button(
                    colors = ButtonDefaults.buttonColors(backgroundColor = WHITE),
                    onClick = { viewModel!!.getUserModel(user_name, password)},
                    modifier = Modifier
                        .padding(20.dp)
                        .background(WHITE)
                        .padding(5.dp)
                        .clip(RoundedCornerShape(50.dp))
                        ,
                    content = { Text(text = "Ingresar", color = Color.Black)}
                )
                Text(text = "No tienes cuenta?")
                TextButton(

                    onClick = { /*TODO*/ },
                    content = { Text(text = "Solicitala aqui", color = Color.White)}
                    )
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(bottom = 50.dp),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.Bottom,

                ) {
                    Button(
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
                        onClick = { navigateToCalendar(navController)},
                        modifier = Modifier
                            .clip(RectangleShape)
                            .background(WHITE)
                            .clip(RoundedCornerShape(topStart = 50.dp, bottomStart = 50.dp))

                        ,
                        content = { Text(text = "Calendario", color = Color.Black)}

                    )
                }
            }

        }
    }
    }
}
fun navigateToCalendar(navController: NavController){
    navController.navigate("calendar")
}
@Preview(showBackground = true)
@Composable
fun LoginPreview(){
    PoleStudioV3Theme {
        LoginScreen(navController = rememberNavController(), null, null)
    }
}