package br.com.nura.andorinha.components.scaffold

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import br.com.nura.andorinha.theme.Dimens

/**
 * Um Scaffold que aplica padding automático para status bar, navigation bar e teclado (IME),
 * garantindo uma área segura para o conteúdo da tela.
 */
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SafeAreaScaffold(
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    fallbackImePadding: Dp = Dimens.Spacing.Medium,
    topBar: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    floatingActionButton: @Composable () -> Unit = { },
    content: @Composable (PaddingValues) -> Unit
) {
    val imeVisible = WindowInsets.ime.getBottom(LocalDensity.current) > 0
    val imePadding = if (imeVisible) {
        WindowInsets.ime.asPaddingValues()
    } else {
        PaddingValues(bottom = fallbackImePadding)
    }

    val combinedPadding = PaddingValues(
        start = maxOf(
            WindowInsets.systemBars.asPaddingValues().calculateStartPadding(LayoutDirection.Ltr),
            contentPadding.calculateStartPadding(LayoutDirection.Ltr)
        ),
        top = maxOf(
            WindowInsets.statusBars.asPaddingValues().calculateTopPadding(),
            contentPadding.calculateTopPadding()
        ),
        end = maxOf(
            WindowInsets.systemBars.asPaddingValues().calculateEndPadding(LayoutDirection.Ltr),
            contentPadding.calculateEndPadding(LayoutDirection.Ltr)
        ),
        bottom = maxOf(
            WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding(),
            imePadding.calculateBottomPadding(),
            contentPadding.calculateBottomPadding()
        )
    )

    Scaffold(
        modifier = modifier,
        topBar = topBar,
        bottomBar = bottomBar,
        floatingActionButton = floatingActionButton,
        content = {
            content(combinedPadding)
        }
    )
}
