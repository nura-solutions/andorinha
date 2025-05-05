package br.com.nura.andorinha.utils

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Aplica padding correspondente à barra de status do sistema.
 */
@Composable
fun Modifier.statusBarPadding(): Modifier =
    this.padding(WindowInsets.statusBars.asPaddingValues())

/**
 * Aplica padding correspondente à barra de navegação (gestos ou botão).
 */
@Composable
fun Modifier.navigationBarPadding(): Modifier =
    this.padding(WindowInsets.navigationBars.asPaddingValues())

/**
 * Aplica padding que respeita a barra de status e navegação.
 */
@Composable
fun Modifier.systemBarsPadding(): Modifier =
    this.padding(WindowInsets.systemBars.asPaddingValues())

/**
 * Aplica padding correspondente ao teclado virtual (IME).
 * Útil quando o teclado estiver aberto.
 */
@Composable
fun Modifier.keyboardPadding(): Modifier =
    this.padding(WindowInsets.ime.asPaddingValues())

/**
 * Adiciona padding inferior que respeita o teclado quando necessário, mas aplica fallback se não estiver visível.
 */
@Composable
fun Modifier.keyboardOrDefaultPadding(fallback: Dp = 16.dp): Modifier {
    val imeVisible =
        WindowInsets.ime.getBottom(androidx.compose.ui.platform.LocalDensity.current) > 0
    return if (imeVisible) {
        this.keyboardPadding()
    } else {
        this.padding(bottom = fallback)
    }
}
