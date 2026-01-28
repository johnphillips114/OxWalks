package ca.oxlox.oxwalks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ca.oxlox.oxwalks.ui.JourneyWalkerAppContent
import ca.oxlox.oxwalks.ui.theme.OxWalksTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OxWalksTheme {
                JourneyWalkerAppContent()
            }
        }
    }
}
