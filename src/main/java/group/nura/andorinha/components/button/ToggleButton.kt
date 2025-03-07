package group.nura.andorinha.components.button

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import group.nura.andorinha.theme.Dimens
import group.nura.andorinha.R

data class ToggleOption(
    val id: Int,
    var value: Int,
    var selected: Boolean,
)

@Composable
fun ToggleButton(options: List<ToggleOption>, onSelected: (ToggleOption) -> Unit) {
    val onSelect = { option: ToggleOption ->
        onSelected(option)
    }

    Row {
        options.forEachIndexed { index, option ->
            BaseToggleButton(
                text = stringResource(id = option.value),
                selected = option.selected,
                onClick = {
                    onSelect(option)
                }
            )

            if (index != options.lastIndex) {
                Spacer(modifier = Modifier.width(Dimens.Medium_100))
            }
        }
    }
}

@Composable
private fun BaseToggleButton(
    modifier: Modifier = Modifier,
    text: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier
            .width(144.dp)
            .height(40.dp),
        shape = RoundedCornerShape(5.dp),
        onClick = {
            onClick()
        }
    ) {
        BasicText(text = text)
    }
}

@Composable
@Preview
fun PreviewSwitchButton() {
    Column() {
        ToggleButton(
            listOf(ToggleOption(0, R.string.app_name, false), ToggleOption(1, androidx.appcompat.R.string.abc_action_bar_home_description, true))
        ) {

        }
    }
}