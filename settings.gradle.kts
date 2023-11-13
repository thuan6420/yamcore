pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("testLibs") {
            from(files("gradle/testLibs.versions.toml"))
        }
        create("coreLibs") {
            from(files("gradle/coreLibs.versions.toml"))
        }
    }
}

rootProject.name = "yamcore"
include(":app")
include(":core")
