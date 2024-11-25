pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*");
                includeGroupByRegex("com\\.google.*");
                includeGroupByRegex("androidx.*");
            }
        }
        mavenCentral();
        gradlePluginPortal();
        maven { url = uri("https://jitpack.io") };
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS) // Đảm bảo dòng này đã tồn tại
    repositories {
        google()
        mavenCentral() // Thêm dòng này
    }

}

rootProject.name = "Delivery_Lotteria"
include(":app")
include(":RoundedImageView")
