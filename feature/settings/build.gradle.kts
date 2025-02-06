import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
}

kotlin {
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs { browser() }

    // Desktop target added to enable Preview functionality.
    // Remove once Previews are properly generated when wasm is the only target
    jvm("desktop")

    sourceSets {
        commonMain.dependencies {
            implementation(projects.library.datastore)
            implementation(projects.library.designSystem)

            implementation(compose.components.uiToolingPreview)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.material3AdaptiveNavigationSuite)
            implementation(compose.runtime)
            implementation(compose.ui)
        }
    }
}
