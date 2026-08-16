package com.twohearts.app.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.material3.MaterialTheme

private val LightColors = lightColorScheme(
    primary = Primary,
    onPrimary = OnPrimary,
    background = Background,
    onBackground = OnBackground
)

private val DarkColors = darkColorScheme(
    primary = Primary,
    onPrimary = OnPrimary,
    background = Background,
    onBackground = OnBackground
)

@Composable
fun TwoHeartsTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = TwoHeartsTypography,
        shapes = TwoHeartsShapes,
        content = content
    )
}
