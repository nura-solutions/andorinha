package group.nura.andorinha.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import group.nura.andorinha.components.button.AnchorButton
import group.nura.andorinha.components.button.PrimaryButton
import group.nura.andorinha.components.button.RoundedButton
import group.nura.andorinha.components.button.SecondaryButton
import group.nura.andorinha.components.icon.Icon
import group.nura.andorinha.components.textfield.PasswordTextField
import group.nura.andorinha.components.textfield.SimpleTextField
import group.nura.andorinha.theme.AndorinhaTheme
import group.nura.andorinha.theme.Dimens
import group.nura.andorinha.R

@Composable
fun AndorinhaScreen() {
    Column(
        modifier = Modifier
            .padding(Dimens.Small_100)
            .verticalScroll(rememberScrollState()),
    ) {
        BasicText(text = "Downloads Screen")
        Spacer(modifier = Modifier.height(Dimens.Small_100))
        PrimaryButtons()
        Spacer(modifier = Modifier.height(Dimens.Small_100))
        RoundedButtons()
        Spacer(modifier = Modifier.height(Dimens.Small_100))
        SecondaryButtons()
        Spacer(modifier = Modifier.height(Dimens.Small_100))
        AnchorButtons()
        Spacer(modifier = Modifier.height(Dimens.Small_100))
        TextFields()
    }
}

@Composable
private fun AnchorButtons() {
    BasicText(text = "Anchor Buttons")
    Spacer(modifier = Modifier.height(Dimens.Small_100))
    AnchorButton(
        text = "Anchor button"
    ) {}
}

@Composable
private fun SecondaryButtons() {
    BasicText(text = "Secondary Buttons")
    Spacer(modifier = Modifier.height(Dimens.Small_100))
    SecondaryButton(
        modifier = Modifier,
        text = "Secondary Button"
    ) {}
    Spacer(modifier = Modifier.height(Dimens.Small_100))
    SecondaryButton(
        modifier = Modifier,
        text = "Secondary Button"
    ) {}
}

@Composable
private fun RoundedButtons() {
    BasicText(text = "Rounded Buttons")
    Spacer(modifier = Modifier.height(Dimens.Small_100))
    RoundedButton(
        modifier = Modifier,
        text = "Rounded Button"
    ) {}
    Spacer(modifier = Modifier.height(Dimens.Small_100))
    RoundedButton(
        modifier = Modifier,
        text = "Rounded Button"
    ) {}
}

@Composable
private fun PrimaryButtons() {
    BasicText(text = "Primary Buttons")
    Spacer(modifier = Modifier.height(Dimens.Small_100))
    PrimaryButton(
        modifier = Modifier,
        text = "Primary Button"
    ) {}
    Spacer(modifier = Modifier.height(Dimens.Small_100))
    PrimaryButton(
        modifier = Modifier,
        text = "Primary Button"
    ) {}
    Spacer(modifier = Modifier.height(Dimens.Small_100))
    PrimaryButton(
        modifier = Modifier,
        enabled = false,
        text = "Primary Button"
    ) {}
    Spacer(modifier = Modifier.height(Dimens.Small_100))
    PrimaryButton(
        modifier = Modifier,
        enabled = false,
        text = "Primary Button"
    ) {}
}

@Composable
private fun TextFields() {
    val simpleTextField = @Composable {
        var text by remember { mutableStateOf("") }
        var isError by remember { mutableStateOf(false) }

        SimpleTextField(
            value = text,
            label = "Trailing Icon Text Field",
            isError = isError,
            trailingIcon = {
                if (isError) Icon( resId = R.drawable.ic_cancel_filled )
                if (text.length > 8) Icon(resId = R.drawable.ic_check_filled )
            },
            onValueChange = { newText ->
                isError = newText.isEmpty()
                text = newText
            },
        )
        Spacer(modifier = Modifier.height(Dimens.XSmall_100))
        BasicText(text = text)
    }

    val passwordTextField = @Composable {
        var text by remember { mutableStateOf("") }
        PasswordTextField(
            value = text,
            label = "Password Text Field",
            onValueChange = { newValue -> text = newValue })
        Spacer(modifier = Modifier.height(Dimens.XSmall_100))
        BasicText(text = text)
    }

    Spacer(modifier = Modifier.height(Dimens.Small_100))
    passwordTextField()
    Spacer(modifier = Modifier.height(Dimens.Small_100))
    simpleTextField()
}

@Composable
@Preview
fun PreviewAndorinhaScreen() {
    AndorinhaTheme {
        AndorinhaScreen()
    }
}