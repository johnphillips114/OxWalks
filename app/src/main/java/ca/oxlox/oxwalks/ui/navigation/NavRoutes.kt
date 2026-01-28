package ca.oxlox.oxwalks.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Explore
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.EmojiEvents
import androidx.compose.material.icons.outlined.Explore
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.Serializable

sealed interface NavRoute {
    @Serializable
    data object Home : NavRoute

    @Serializable
    data object Journeys : NavRoute

    @Serializable
    data class JourneyDetail(val journeyId: Long) : NavRoute

    @Serializable
    data object MyJourneys : NavRoute

    @Serializable
    data object Map : NavRoute

    @Serializable
    data object Achievements : NavRoute

    @Serializable
    data object Progress : NavRoute

    @Serializable
    data object Settings : NavRoute
}

data class BottomNavItem(
    val route: NavRoute,
    val label: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector
)

val bottomNavItems = listOf(
    BottomNavItem(
        route = NavRoute.Home,
        label = "Home",
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home
    ),
    BottomNavItem(
        route = NavRoute.Journeys,
        label = "Journeys",
        selectedIcon = Icons.Filled.Explore,
        unselectedIcon = Icons.Outlined.Explore
    ),
    BottomNavItem(
        route = NavRoute.Achievements,
        label = "Achievements",
        selectedIcon = Icons.Filled.EmojiEvents,
        unselectedIcon = Icons.Outlined.EmojiEvents
    ),
    BottomNavItem(
        route = NavRoute.Settings,
        label = "Settings",
        selectedIcon = Icons.Filled.Settings,
        unselectedIcon = Icons.Outlined.Settings
    )
)
