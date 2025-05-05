package br.com.nura.andorinha.components.textfield

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.nura.andorinha.theme.Dimens
import br.com.nura.andorinha.utils.mask.MaskTransformation

@Composable
fun PasswordTextField(
    modifier: Modifier = Modifier,
    value: String,
    label: String? = null,
    enabled: Boolean = true,
    isError: Boolean = false,
    readOnly: Boolean = false,
    supportingText: @Composable (() -> Unit)? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions(
        imeAction = ImeAction.Next,
        keyboardType = KeyboardType.Password
    ),
    trailingIcon: @Composable (() -> Unit)? = null,
    onValueChange: (String) -> Unit,
) {
    BaseTextField(
        modifier = modifier,
        value = value,
        label = label,
        supportingText = supportingText,
        enabled = enabled,
        isError = isError,
        readOnly = readOnly,
        visualTransformation = PasswordVisualTransformation('*'),
        keyboardOptions = keyboardOptions,
        trailingIcon = trailingIcon,
        onValueChange = onValueChange
    )
}

@Composable
fun SimpleTextField(
    modifier: Modifier = Modifier,
    value: String,
    label: String? = null,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    isError: Boolean = false,
    singleLine: Boolean = true,
    placeholder: String? = null,
    mask: MaskTransformation? = null,
    keyboardOptions: KeyboardOptions = KeyboardOptions(
        imeAction = ImeAction.Next
    ),
    supportingText: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    onValueChange: (String) -> Unit,
) {
    BaseTextField(
        modifier = modifier,
        value = value,
        label = label,
        enabled = enabled,
        readOnly = readOnly,
        isError = isError,
        singleLine = singleLine,
        visualTransformation = mask ?: VisualTransformation.None,
        trailingIcon = trailingIcon,
        keyboardOptions = keyboardOptions,
        placeholder = placeholder,
        supportingText = supportingText,
        onValueChange = {
            if (mask == null || it.length <= mask.unmaskedMaxLength) {
                onValueChange(it)
            }
        }
    )
}

@Composable
fun SelectableTextField(
    value: String,
    label: String,
    onClick: () -> Unit,
) {
    BaseTextField(
        modifier = Modifier,
        value = value,
        label = label,
        enabled = false,
        readOnly = true,
        onClick = onClick,
        onValueChange = { }
    )
}

@Composable
private fun BaseTextField(
    modifier: Modifier = Modifier,
    value: String,
    label: String? = null,
    supportingText: @Composable() (() -> Unit)? = null,
    enabled: Boolean = true,
    isError: Boolean = false,
    singleLine: Boolean = true,
    readOnly: Boolean = false,
    placeholder: String? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
    trailingIcon: @Composable (() -> Unit)? = null,
    onClick: (() -> Unit)? = null,
    onValueChange: (String) -> Unit,
) {
    Column(modifier = modifier) {
        label?.let {
            Text(
                text = label,
                style = MaterialTheme.typography.labelLarge
            )
        }
        Spacer(modifier = Modifier.height(Dimens.Spacing.Small))
        val buttonShape = RoundedCornerShape(12.dp)

        var txtFieldModifier = modifier
        if (onClick != null) {
            txtFieldModifier = modifier.clickable { onClick() }
        }
        OutlinedTextField(
            modifier = txtFieldModifier.fillMaxWidth(),
            value = value,
            shape = buttonShape,
            enabled = enabled,
            isError = isError,
            singleLine = singleLine,
            readOnly = readOnly,
            placeholder = {
                if (!placeholder.isNullOrBlank()) {
                    BasicText(text = placeholder)
                }
            },
            keyboardOptions = keyboardOptions,
            keyboardActions = KeyboardActions.Default,
            visualTransformation = visualTransformation,
            trailingIcon = trailingIcon,
            onValueChange = onValueChange,
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = MaterialTheme.colorScheme.primaryContainer,
                errorBorderColor = MaterialTheme.colorScheme.error,
                focusedTextColor = MaterialTheme.colorScheme.onBackground,
                unfocusedTextColor = MaterialTheme.colorScheme.onBackground,
                focusedContainerColor = MaterialTheme.colorScheme.background,
                errorContainerColor = MaterialTheme.colorScheme.background,
                unfocusedContainerColor = MaterialTheme.colorScheme.background,
            )
        )
        Spacer(modifier = Modifier.height(Dimens.Spacing.XSmall))

        supportingText?.invoke()
    }
}

@Composable
@Preview
fun PreviewTextField() {
    Column {
        BaseTextField(
            value = "Text Field",
            label = "label",
            visualTransformation = PasswordVisualTransformation('*'),
            onValueChange = {

            }
        )
    }
}