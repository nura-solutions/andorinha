package group.nura.andorinha.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val colors = lightColorScheme(
    primary = Color.Primary,
    onPrimary = Color.OnPrimary,
    primaryContainer = Color.PrimaryContainer,
    onPrimaryContainer = Color.OnPrimaryContainer,
    secondary = Color.Secondary,
    onSecondary = Color.OnSecondary,
    secondaryContainer = Color.SecondaryContainer,
    onSecondaryContainer = Color.OnSecondaryContainer,
    tertiary = Color.Tertiary,
    onTertiary = Color.OnTertiary,
    tertiaryContainer = Color.TertiaryContainer,
    onTertiaryContainer = Color.OnTertiaryContainer,
    error = Color.Error,
    errorContainer = Color.ErrorContainer,
    onError = Color.OnError,
    onErrorContainer = Color.OnErrorContainer,
    background = Color.Background,
    onBackground = Color.OnBackground,
    surface = Color.Surface,
    onSurface = Color.OnSurface,
    surfaceVariant = Color.SurfaceVariant,
    onSurfaceVariant = Color.OnSurfaceVariant,
    outline = Color.Outline,
    inverseOnSurface = Color.InverseOnSurface,
    inverseSurface = Color.InverseSurface,
    inversePrimary = Color.InversePrimary,
    surfaceTint = Color.SurfaceTint,
    outlineVariant = Color.OutlineVariant,
    scrim = Color.Scrim,
)

@Composable
fun AndorinhaTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = colors,
        typography = AppTypography,
        content = content
    )
}