import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

plugins {
    alias(libs.plugins.kotlinMultiplatform)
}

kotlin {
    @OptIn(ExperimentalWasmDsl::class)
    wasmJs { browser() }

    // Desktop target added to enable Preview functionality.
    // Remove once Previews are properly generated when wasm is the only target
    jvm("desktop")

    sourceSets {
        commonMain.dependencies {
            implementation(libs.settings.no.arg)
        }
    }
}
