import com.thuan6420.buildsrc.Configuration

@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.thuan6420.core"
    compileSdk = Configuration.compileSdk

    defaultConfig {
        minSdk = Configuration.minSdk
    }

    buildFeatures{
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = coreLibs.versions.jvmTarget.get()
    }
}

tasks.withType(JavaCompile::class.java).configureEach {
    this.targetCompatibility = coreLibs.versions.jvmTarget.get()
    this.sourceCompatibility = coreLibs.versions.jvmTarget.get()
}

dependencies {
    implementation(coreLibs.androidx.appcompat)
    implementation(coreLibs.androidx.fragment)
    implementation(coreLibs.androidx.lifecycle)
    implementation(coreLibs.androidx.annotation)
}