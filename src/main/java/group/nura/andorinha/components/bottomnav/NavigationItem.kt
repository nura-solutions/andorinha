package group.nura.andorinha.components.bottomnav

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import group.nura.andorinha.R
import group.nura.andorinha.theme.Dimens
import group.nura.andorinha.utils.ifTrue

@Composable
fun RowScope.NavigationItem(
    navController: NavController,
    currentDestination: String,
    route: NavRoute,
) {
    val isSelected = currentDestination == route.route
    NavigationBarItem(
        selected = isSelected,
        onClick = {
            if (currentDestination != route.route)
                navController.navigate((route.route))
        },
        colors = NavigationBarItemDefaults.colors(
            indicatorColor = MaterialTheme.colorScheme.surface
        ),
        icon = {
            Column(
                modifier = Modifier.ifTrue({ route.isHighlighted }) {
                    val color = if (isSelected)
                        MaterialTheme.colorScheme.surfaceTint
                    else
                        MaterialTheme.colorScheme.onSurface
                    background(
                        color = color,
                        shape = RoundedCornerShape(50)
                    )
                        .padding(
                            horizontal = Dimens.Medium_150,
                            vertical = Dimens.XSmall_100
                        )
                },
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                NavIcon(
                    route.iconId,
                    route.isHighlighted
                )
                if (!route.isHighlighted) {
                    Spacer(modifier = Modifier.height(Dimens.Small_100))
                    SelectedMarker(isSelected)
                }
            }
        }
    )
}

@Composable
@Preview
fun PreviewNavigationItem() {
    val navC = rememberNavController()

    Row {
        NavigationItem(
            navController = navC,
            "path2",
            route = NavRoute(
                "path2",
                R.drawable.ic_home,
                false
            )
        )
    }
}