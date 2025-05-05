package br.com.nura.andorinha.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.nura.andorinha.R
import br.com.nura.andorinha.components.button.AnchorButton
import br.com.nura.andorinha.components.button.PrimaryButton
import br.com.nura.andorinha.components.button.RoundedButton
import br.com.nura.andorinha.components.button.SecondaryButton
import br.com.nura.andorinha.components.icon.Icon
import br.com.nura.andorinha.components.textfield.PasswordTextField
import br.com.nura.andorinha.components.textfield.SimpleTextField
import br.com.nura.andorinha.theme.AndorinhaTheme
import br.com.nura.andorinha.theme.Dimens

@Composable
fun AndorinhaScreen() {
    Column(
        modifier = Modifier
            .padding(Dimens.Spacing.Small)
            .verticalScroll(rememberScrollState()),
    ) {
        BasicText(text = "Downloads Screen")
        Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
        PrimaryButtons()
        Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
        RoundedButtons()
        Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
        SecondaryButtons()
        Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
        AnchorButtons()
        Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
        TextFields()
    }
}

@Composable
private fun AnchorButtons() {
    BasicText(text = "Anchor Buttons")
    Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
    AnchorButton(
        text = "Anchor button"
    ) {}
}

@Composable
private fun SecondaryButtons() {
    BasicText(text = "Secondary Buttons")
    Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
    SecondaryButton(
        modifier = Modifier,
        text = "Secondary Button"
    ) {}
    Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
    SecondaryButton(
        modifier = Modifier,
        text = "Secondary Button"
    ) {}
}

@Composable
private fun RoundedButtons() {
    BasicText(text = "Rounded Buttons")
    Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
    RoundedButton(
        modifier = Modifier,
        text = "Rounded Button"
    ) {}
    Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
    RoundedButton(
        modifier = Modifier,
        text = "Rounded Button"
    ) {}
}

@Composable
private fun PrimaryButtons() {
    BasicText(text = "Primary Buttons")
    Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
    PrimaryButton(
        modifier = Modifier,
        text = "Primary Button"
    ) {}
    Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
    PrimaryButton(
        modifier = Modifier,
        text = "Primary Button"
    ) {}
    Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
    PrimaryButton(
        modifier = Modifier,
        enabled = false,
        text = "Primary Button"
    ) {}
    Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
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
                if (isError) Icon(resId = R.drawable.ic_cancel_filled)
                if (text.length > 8) Icon(resId = R.drawable.ic_check_filled)
            },
            onValueChange = { newText ->
                isError = newText.isEmpty()
                text = newText
            },
        )
        Spacer(modifier = Modifier.height(Dimens.Spacing.XSmall))
        BasicText(text = text)
    }

    val passwordTextField = @Composable {
        var text by remember { mutableStateOf("") }
        PasswordTextField(
            value = text,
            label = "Password Text Field",
            onValueChange = { newValue -> text = newValue })
        Spacer(modifier = Modifier.height(Dimens.Spacing.XSmall))
        BasicText(text = text)
    }

    Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
    passwordTextField()
    Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
    simpleTextField()
}

@Composable
@Preview
fun PreviewAndorinhaScreen() {
    AndorinhaTheme {
        AndorinhaScreen()
    }
}