package group.nura.andorinha.theme

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
import group.nura.andorinha.components.scaffold.SafeAreaScaffold

val lightColors = DesignColor(
    primary = Color(0xFFFFB370),
    onPrimary = Color(0xFF321200),
    primaryContainer = Color(0xFFFFDBC9),
    onPrimaryContainer = Color(0xFF321200),
    secondary = Color(0xFF7A5900),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFFFDEA2),
    onSecondaryContainer = Color(0xFF261900),
    tertiary = Color(0xFF626033),
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFE9E5AC),
    onTertiaryContainer = Color(0xFF1D1D00),
    error = Color(0xFFBA1A1A),
    errorContainer = Color(0xFFFFDAD6),
    onError = Color(0xFFFFFFFF),
    onErrorContainer = Color(0xFF410002),
    background = Color(0xFFF2FFFD),
    onBackground = Color(0xFF00201E),
    surface = Color(0xFFE9CEAE),
    onSurface = Color(0xFF00201E),
    surfaceVariant = Color(0xFFF4DED4),
    onSurfaceVariant = Color(0xFF52443C),
    outline = Color(0xFF85746B),
    inverseOnSurface = Color(0xFFB1FFF8),
    inverseSurface = Color(0xFF003734),
    inversePrimary = Color(0xFFFFB68C),
    shadow = Color(0xFF000000),
    surfaceTint = Color(0xFF9A4600),
    outlineVariant = Color(0xFFD7C2B8),
    scrim = Color(0xFF000000),
    seed = Color(0xFFFF7902),
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
            primaryContainer = darkDesignColorScheme.primaryContainer,
            onPrimaryContainer = darkDesignColorScheme.onPrimaryContainer,
            secondary = darkDesignColorScheme.secondary,
            onSecondary = darkDesignColorScheme.onSecondary,
            secondaryContainer = darkDesignColorScheme.secondaryContainer,
            onSecondaryContainer = darkDesignColorScheme.onSecondaryContainer,
            tertiary = darkDesignColorScheme.tertiary,
            onTertiary = darkDesignColorScheme.onTertiary,
            tertiaryContainer = darkDesignColorScheme.tertiaryContainer,
            onTertiaryContainer = darkDesignColorScheme.onTertiaryContainer,
            error = darkDesignColorScheme.error,
            errorContainer = darkDesignColorScheme.errorContainer,
            onError = darkDesignColorScheme.onError,
            onErrorContainer = darkDesignColorScheme.onErrorContainer,
            background = darkDesignColorScheme.background,
            onBackground = darkDesignColorScheme.onBackground,
            surface = darkDesignColorScheme.surface,
            onSurface = darkDesignColorScheme.onSurface,
            surfaceVariant = darkDesignColorScheme.surfaceVariant,
            onSurfaceVariant = darkDesignColorScheme.onSurfaceVariant,
            outline = darkDesignColorScheme.outline,
            inverseOnSurface = darkDesignColorScheme.inverseOnSurface,
            inverseSurface = darkDesignColorScheme.inverseSurface,
            inversePrimary = darkDesignColorScheme.inversePrimary,
            surfaceTint = darkDesignColorScheme.surfaceTint,
            outlineVariant = darkDesignColorScheme.outlineVariant,
            scrim = darkDesignColorScheme.scrim
        )
    } else {
        lightColorScheme(
            primary = lightDesignColorScheme.primary,
            onPrimary = lightDesignColorScheme.onPrimary,
            primaryContainer = lightDesignColorScheme.primaryContainer,
            onPrimaryContainer = lightDesignColorScheme.onPrimaryContainer,
            secondary = lightDesignColorScheme.secondary,
            onSecondary = lightDesignColorScheme.onSecondary,
            secondaryContainer = lightDesignColorScheme.secondaryContainer,
            onSecondaryContainer = lightDesignColorScheme.onSecondaryContainer,
            tertiary = lightDesignColorScheme.tertiary,
            onTertiary = lightDesignColorScheme.onTertiary,
            tertiaryContainer = lightDesignColorScheme.tertiaryContainer,
            onTertiaryContainer = lightDesignColorScheme.onTertiaryContainer,
            error = lightDesignColorScheme.error,
            errorContainer = lightDesignColorScheme.errorContainer,
            onError = lightDesignColorScheme.onError,
            onErrorContainer = lightDesignColorScheme.onErrorContainer,
            background = lightDesignColorScheme.background,
            onBackground = lightDesignColorScheme.onBackground,
            surface = lightDesignColorScheme.surface,
            onSurface = lightDesignColorScheme.onSurface,
            surfaceVariant = lightDesignColorScheme.surfaceVariant,
            onSurfaceVariant = lightDesignColorScheme.onSurfaceVariant,
            outline = lightDesignColorScheme.outline,
            inverseOnSurface = lightDesignColorScheme.inverseOnSurface,
            inverseSurface = lightDesignColorScheme.inverseSurface,
            inversePrimary = lightDesignColorScheme.inversePrimary,
            surfaceTint = lightDesignColorScheme.surfaceTint,
            outlineVariant = lightDesignColorScheme.outlineVariant,
            scrim = lightDesignColorScheme.scrim,
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