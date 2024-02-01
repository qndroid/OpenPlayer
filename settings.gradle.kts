pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven(url = "https://jitpack.io") {
            credentials {
                username = "qndroid"
                password = "jp_i8ngum8ph59veom06eucf810ir"
            }
        }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io") {
            credentials {
                username = "qndroid"
                password = "Rzq123456"
            }
        }
    }
}

rootProject.name = "OpenPlayer"
include(":app")
include(":openplayer")
include(":openpreload")
