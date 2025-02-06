package dev.sjaramillo.library.datastore

import com.russhwolf.settings.Settings

class DefaultAppPreferences(private val settings: Settings) : AppPreferences {

    override var appTheme: AppTheme
        get() = AppTheme.valueOf(settings.getString(KEY_APP_THEME, AppTheme.AUTO.name))
        set(value) {
            settings.putString(KEY_APP_THEME, value.name)
        }

    companion object {
        // TODO: This will become a singleton, once we have DI
        private var INSTANCE: AppPreferences? = null

        fun getInstance(): AppPreferences {
            if (INSTANCE == null) {
                INSTANCE = DefaultAppPreferences(Settings())
            }

            return INSTANCE!!
        }

        private const val KEY_APP_THEME = "key_app_theme"
    }
}
