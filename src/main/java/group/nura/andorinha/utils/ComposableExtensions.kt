package group.nura.andorinha.utils

import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

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
//
//@Composable
//fun OutlinedTextFieldDefaults.localOutlinedTextFieldColors(
//    textColor: androidx.compose.ui.graphics.Color = Color.Primary,
//    placeholderColor: androidx.compose.ui.graphics.Color = Color.Primary,
//    labelColor: androidx.compose.ui.graphics.Color = Color.Primary,
//    borderColor: androidx.compose.ui.graphics.Color = Color.Primary,
//    errorBorderColor: androidx.compose.ui.graphics.Color = Color.Error,
//    disabledTextColor: androidx.compose.ui.graphics.Color = Color.Primary,
//    disabledContainerColor: androidx.compose.ui.graphics.Color = Color.Primary
//): TextFieldColors {
//    return colors()
////    return colors(
////        unfocusedTextColor = textColor,
////        focusedTextColor = textColor,
////        errorTextColor = textColor,
////        unfocusedPlaceholderColor = placeholderColor,
////        focusedPlaceholderColor = placeholderColor,
////        focusedBorderColor = borderColor,
////        unfocusedBorderColor = borderColor,
////        errorBorderColor = errorBorderColor,
////        disabledBorderColor = borderColor,
////        focusedLabelColor = labelColor,
////        disabledLabelColor = labelColor,
////        disabledTextColor = disabledTextColor,
////        disabledSupportingTextColor = disabledTextColor,
////        errorLabelColor = labelColor,
////        unfocusedLabelColor = labelColor,
////        disabledContainerColor = disabledContainerColor
////    )
//}

inline fun Modifier.ifTrue(condition: () -> Boolean, block: Modifier.() -> Modifier): Modifier {
    return if (condition()) block() else this
}