package br.com.nura.andorinha.animation

import androidx.compose.foundation.ScrollState
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layout

/**ð
 * Adds a parallax effect to a composable inside a Scrollable view
 * @param scrollState the scroll state of the scrollable view
 * @param rate defines how much slower the view will fade away
 */
fun Modifier.parallaxLayoutModifier(scrollState: ScrollState, rate: Float) = layout { measurable, constraints ->
    val placeable = measurable.measure(constraints)
    val height = (scrollState.value * rate).toInt()
    layout(placeable.width, placeable.height) {
        placeable.place(0, height)
    }
}