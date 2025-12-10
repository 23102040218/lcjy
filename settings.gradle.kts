pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        // 国内镜像源（优先使用，提高下载速度）
        maven { url = uri("https://maven.aliyun.com/repository/public") }
        maven { url = uri("https://maven.aliyun.com/repository/google") }
        maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin") }
        maven { url = uri("https://maven.aliyun.com/repository/jcenter") }
        
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
        // 高德地图 Maven 仓库
        maven { url = uri("https://repo1.maven.org/maven2/") }
        // 高德地图官方 Maven 仓库（如果需要）
        maven { url = uri("https://maven.aliyun.com/repository/public") }
    }
}

rootProject.name = "agriplatform"
include(":app")