package br.com.nura.andorinha.composition.genericerror

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.nura.andorinha.R
import br.com.nura.andorinha.components.icon.Icon
import br.com.nura.andorinha.theme.AndorinhaTheme
import br.com.nura.andorinha.theme.Dimens
import br.com.nura.andorinha.theme.LocalAppColors

@Composable
fun GenericErrorScreen(
    title:  @Composable () -> Unit = {
        Text(stringResource(
            R.string.generic_error_title),
            style = MaterialTheme.typography.headlineSmall
        )
    },
    message:  @Composable () -> Unit = {
        Text(stringResource(R.string.generic_error_message),
            style = MaterialTheme.typography.bodyLarge
        )
    },
    onButtonClick: () -> Unit = {},
    action:  @Composable () -> Unit = {
        Button(onClick = onButtonClick) {
            Text(text = stringResource(R.string.generic_error_button))
        }
    },
    errorImage: @Composable () -> Unit = {
        Icon(
            modifier = Modifier.size(Dimens.Image.XXLarge),
            resId = R.drawable.ic_generic_error
        )
    },
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(LocalAppColors.current.surface)
            .padding(Dimens.Spacing.XLarge),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        errorImage()
        Spacer(modifier = Modifier.height(Dimens.Spacing.Large))
        title()
        Spacer(modifier = Modifier.height(Dimens.Spacing.Large))
        message()
        Spacer(modifier = Modifier.height(Dimens.Spacing.XMedium))
        action()
    }
}

@Preview
@Composable
fun PreviewGenericErrorScreen() {
    AndorinhaTheme {
        GenericErrorScreen()
    }
}