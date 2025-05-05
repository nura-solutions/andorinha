package br.com.nura.andorinha.theme

import androidx.compose.runtime.staticCompositionLocalOf

val LocalAppColors = staticCompositionLocalOf<DesignColor> {
    error("DesignColor not provided")
}
