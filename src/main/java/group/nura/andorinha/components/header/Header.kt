package group.nura.andorinha.components.header

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import group.nura.andorinha.R
import group.nura.andorinha.components.button.IconButton
import group.nura.andorinha.theme.AndorinhaTheme
import group.nura.andorinha.theme.Dimens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeaderSmall(
    navController: NavController,
    text: String,
    hasNavigationArrow: Boolean = true
) {
    TopAppBar(
        title = {
            BasicText(
                text = text,
                style = MaterialTheme.typography.headlineLarge,
            )
        },
        navigationIcon = {
            if (hasNavigationArrow) {
                IconButton(
                    icon = R.drawable.ic_arrow_left,
                ) {
                    navController.navigateUp()
                }
            }
        },
        actions = {

        }
    )
}

@Composable
fun HeaderLarge(
    title: String,
    verticalAlignment: Alignment.Vertical = Alignment.Bottom,
    navigationIcon: @Composable () -> Unit,
) {
    Column {
        Row(
            verticalAlignment = verticalAlignment,
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = MaterialTheme.colorScheme.surface
                )
                .padding(
                    top = Dimens.Medium_150,
                    end = Dimens.Medium_100,
                    bottom = Dimens.Medium_100,
                    start = Dimens.Medium_100
                )
        ) {
            navigationIcon()
            Text(
                modifier = Modifier.padding(horizontal = Dimens.Medium_100),
                text = title,
                style = MaterialTheme.typography.headlineLarge.copy(
                    color = MaterialTheme.colorScheme.onSurface
                ),
            )
        }
        Divider(
            thickness = 1.dp,
            modifier = Modifier.shadow(1.dp),
            color = MaterialTheme.colorScheme.onSurfaceVariant.copy(
                alpha = 0.1f
            )
        )
    }
}

@Composable
@Preview("Small header")
fun SmallHeaderPreview() {
    AndorinhaTheme {
        HeaderSmall(
            navController = rememberNavController(),
            text = "Header Small"
        )
    }
}

@Composable
@Preview("Large header")
fun LargeHeaderPreview() {
    AndorinhaTheme {
        HeaderLarge(
            title = "Large header",
            navigationIcon = {
                Icon(
                    modifier = Modifier.size(80.dp),
                    imageVector = Icons.Filled.AccountCircle,
                    contentDescription = ""
                )
            }
        )
    }
}