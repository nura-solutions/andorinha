package br.com.nura.andorinha.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

//Replace with your font locations
var Roboto = FontFamily.Default

val AppTypography = Typography(
    // Display
    displayLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        lineHeight = 64.sp,
        fontSize = 50.sp,
        fontFamily = Roboto
    ),
    displayMedium = TextStyle(
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        lineHeight = 52.sp,
        fontSize = 44.sp,
        fontFamily = Roboto
    ),
    displaySmall = TextStyle(
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        lineHeight = 44.sp,
        fontSize = 36.sp,
        fontFamily = Roboto
    ),

    // Headline
    headlineLarge = TextStyle(
        fontWeight = FontWeight.Bold,
        letterSpacing = 0.sp,
        lineHeight = 40.sp,
        fontSize = 32.sp,
        fontFamily = Roboto
    ),
    headlineMedium = TextStyle(
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
        lineHeight = 36.sp,
        fontSize = 28.sp,
        fontFamily = Roboto
    ),
    headlineSmall = TextStyle(
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
        lineHeight = 32.sp,
        fontSize = 24.sp,
        fontFamily = Roboto
    ),

    // Title
    titleLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        lineHeight = 28.sp,
        fontSize = 22.sp,
        fontFamily = Roboto
    ),
    titleMedium = TextStyle(
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
        lineHeight = 24.sp,
        fontSize = 16.sp,
        fontFamily = Roboto
    ),
    titleSmall = TextStyle(
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        fontSize = 14.sp,
        fontFamily = Roboto
    ),

    // Body
    bodyLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        lineHeight = 24.sp,
        fontSize = 16.sp,
        fontFamily = Roboto
    ),
    bodyMedium = TextStyle(
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        fontSize = 14.sp,
        fontFamily = Roboto
    ),
    bodySmall = TextStyle(
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.10000000149011612.sp,
        lineHeight = 16.sp,
        fontSize = 12.sp,
        fontFamily = Roboto
    ),

    // Label
    labelLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.sp,
        lineHeight = 20.sp,
        fontSize = 14.sp,
        fontFamily = Roboto
    ),
    labelMedium = TextStyle(
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.10000000149011612.sp,
        lineHeight = 16.sp,
        fontSize = 12.sp,
        fontFamily = Roboto
    ),
    labelSmall = TextStyle(
        fontWeight = FontWeight.Normal,
        letterSpacing = 0.10000000149011612.sp,
        lineHeight = 16.sp,
        fontSize = 11.sp,
        fontFamily = Roboto
    )
)