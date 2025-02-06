package dev.sjaramillo.feature.settings

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import dev.sjaramillo.library.datastore.DefaultAppPreferences
import dev.sjaramillo.library.designsystem.theme.AppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun SettingsScreen() {
    DefaultAppPreferences.getInstance()
    Text("Settings")
}

@Preview
@Composable
private fun SettingsScreenPreview() = AppTheme {
    SettingsScreen()
}
