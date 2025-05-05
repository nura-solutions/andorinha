package br.com.nura.andorinha.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import br.com.nura.andorinha.components.scaffold.SafeAreaScaffold

val lightColors = DesignColor(
    primary = Color(0xFFE35407),
    onPrimary = Color.White,
    secondary = Color(0xFF7A5900),
    onSecondary = Color.White,
    background = Color(0xFFEBEEF0),
    onBackground = Color(0xFF2D2D2D),
    surface = Color.White,
    onSurface = Color(0xFF333333),
    accent = Color(0xFF16DBCC),
    disabledContainer = Color(0xFFDEDEDE),
    disabled = Color(0xFF999999),
    success = Color(0xFF006527),
    successContainer = Color(0xFF7DE5A1),
    warning = Color(0xFF655900),
    warningContainer = Color(0xFFFFFF68),
    error = Color(0xFFCC0100),
    errorContainer = Color(0xFFFFABAA),
    info = Color(0xFF003765),
    infoContainer = Color(0xFF7DB6E5)
)

@Composable
fun AndorinhaTheme(
    modifier: Modifier = Modifier,
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    lightDesignColorScheme: DesignColor = lightColors,
    darkDesignColorScheme: DesignColor = lightDesignColorScheme,
    fallbackImePadding: Dp = Dimens.Spacing.Medium,
    topBar: @Composable () -> Unit = { },
    bottomBar: @Composable () -> Unit = {},
    floatingActionButton: @Composable () -> Unit = {},
    content: @Composable (PaddingValues) -> Unit
) {
    val appColors = if (isDarkTheme) darkDesignColorScheme else lightDesignColorScheme
    val materialColors = if (isDarkTheme) {
        darkColorScheme(
            primary = darkDesignColorScheme.primary,
            onPrimary = darkDesignColorScheme.onPrimary,
            secondary = darkDesignColorScheme.secondary,
            onSecondary = darkDesignColorScheme.onSecondary,
            error = darkDesignColorScheme.error,
            errorContainer = darkDesignColorScheme.errorContainer,
            background = darkDesignColorScheme.background,
            onBackground = darkDesignColorScheme.onBackground,
            surface = darkDesignColorScheme.surface,
            onSurface = darkDesignColorScheme.onSurface
        )
    } else {
        lightColorScheme(
            primary = lightDesignColorScheme.primary,
            onPrimary = lightDesignColorScheme.onPrimary,
            secondary = lightDesignColorScheme.secondary,
            onSecondary = lightDesignColorScheme.onSecondary,
            error = lightDesignColorScheme.error,
            errorContainer = lightDesignColorScheme.errorContainer,
            background = lightDesignColorScheme.background,
            onBackground = lightDesignColorScheme.onBackground,
            surface = lightDesignColorScheme.surface,
            onSurface = lightDesignColorScheme.onSurface,
        )
    }

    CompositionLocalProvider(LocalAppColors provides appColors) {
        MaterialTheme(
            colorScheme = materialColors,
            typography = AppTypography
        ) {
            SafeAreaScaffold(
                modifier = modifier,
                fallbackImePadding = fallbackImePadding,
                topBar = topBar,
                bottomBar = bottomBar,
                floatingActionButton = floatingActionButton,
                content = content
            )
        }
    }
}