package group.nura.andorinha.components.bottomnav

import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import group.nura.andorinha.R
import group.nura.andorinha.theme.Dimens

@Composable
fun BottomNavigationBar(
    navController: NavController,
    currentDestination: String,
    routes: List<NavRoute>
) {
    NavigationBar(
        tonalElevation = Dimens.Elevation.none,
        content = {
            routes.map {
                NavigationItem(navController, currentDestination, it)
            }

        }
    )
}

class NavRoute(
    val route: String,
    val iconId: Int,
    val isHighlighted: Boolean
)

@Preview
@Composable
fun PreviewBottomNavigationBar() {
    val route1 = NavRoute(
        "path",
        R.drawable.ic_dumbell,
        false
    )
    val route2 = NavRoute(
        "path2",
        R.drawable.ic_home,
        false
    )
    val navController = rememberNavController()
    BottomNavigationBar(navController, "path2", listOf(route1, route2))
}