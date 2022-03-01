package com.example.polestudiov3.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.Font
import com.example.polestudiov3.R

private val poppinsBold = FontFamily(
    Font(R.font.poppins_bold)
)
private val poppinsLight = FontFamily(
    Font(R.font.poppins_light)
)
private val poppinsMedium = FontFamily(
    Font(R.font.poppins_medium)
)
private val poppinsRegular = FontFamily(
    Font(R.font.poppins_regular)
)
// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = poppinsRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),

    button = TextStyle(
        fontFamily = poppinsBold,
        fontWeight = FontWeight.W500,
        fontSize = 20.sp,
    )

/* Other default text styles to override,
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)