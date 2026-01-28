package ca.oxlox.oxwalks.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import ca.oxlox.oxwalks.ui.screens.AchievementsScreen
import ca.oxlox.oxwalks.ui.screens.HomeScreen
import ca.oxlox.oxwalks.ui.screens.JourneysScreen
import ca.oxlox.oxwalks.ui.screens.SettingsScreen

@Composable
fun AppNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Home,
        modifier = modifier
    ) {
        composable<NavRoute.Home> {
            HomeScreen()
        }

        composable<NavRoute.Journeys> {
            JourneysScreen(
                onJourneyClick = { journeyId ->
                    navController.navigate(NavRoute.JourneyDetail(journeyId))
                }
            )
        }

        composable<NavRoute.JourneyDetail> { backStackEntry ->
            val journeyDetail: NavRoute.JourneyDetail = backStackEntry.toRoute()
            // Placeholder - will be implemented in Session 3.3
            HomeScreen() // Temporary placeholder
        }

        composable<NavRoute.Achievements> {
            AchievementsScreen()
        }

        composable<NavRoute.Settings> {
            SettingsScreen()
        }
    }
}
