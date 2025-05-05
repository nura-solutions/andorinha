package br.com.nura.andorinha.utils

import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun ButtonDefaults.elevation(elevation: Dp): ButtonElevation {
    return elevatedButtonElevation(
        defaultElevation = elevation,
        pressedElevation = elevation,
        hoveredElevation = elevation,
        disabledElevation = elevation,
        focusedElevation = elevation

    )
}

inline fun Modifier.ifTrue(condition: () -> Boolean, block: Modifier.() -> Modifier): Modifier {
    return if (condition()) block() else this
}