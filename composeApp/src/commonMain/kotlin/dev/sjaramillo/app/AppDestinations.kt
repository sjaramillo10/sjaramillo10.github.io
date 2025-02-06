package dev.sjaramillo.app

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import org.jetbrains.compose.resources.StringResource
import sjaramillo.composeapp.generated.resources.Res
import sjaramillo.composeapp.generated.resources.home
import sjaramillo.composeapp.generated.resources.profile
import sjaramillo.composeapp.generated.resources.settings

enum class AppDestinations(
    val label: StringResource,
    val icon: ImageVector,
    val contentDescription: StringResource,
) {
    HOME(Res.string.home, Icons.Default.Home, Res.string.home),
    PROFILE(Res.string.profile, Icons.Default.AccountBox, Res.string.profile),
    SETTINGS(Res.string.settings, Icons.Default.Settings, Res.string.settings),
}
