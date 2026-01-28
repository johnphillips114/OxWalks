package ca.oxlox.oxwalks.di

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppInfo @Inject constructor() {
    val appName: String = "Journey Walker"
    val version: String = "1.0.0"
}
