package com.example.polestudiov3.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Purple200,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    /*primary = WHITE,
    primaryVariant = WHITE_MODIFIED,
    secondary = BLACK_MODIFIED,
    background = BLACK,
    surface = WHITE,
    onPrimary = WHITE,
    onSecondary = WHITE,
    onBackground = WHITE,
    onSurface = WHITE*/
    primary = WHITE,
    primaryVariant = WHITE,
    secondary = BLACK,
    background = BLACK,
    surface = WHITE,
    onPrimary = WHITE,
    onSecondary = WHITE,
    onBackground = WHITE,
    onSurface = WHITE



)

@Composable
fun PoleStudioV3Theme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        //DarkColorPalette
        LightColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}