package dev.sjaramillo.library.datastore

interface AppPreferences {
    var appTheme: AppTheme
}

enum class AppTheme { AUTO, LIGHT, DARK }
