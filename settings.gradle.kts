pluginManagement {
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
        mavenCentral()
    }
    
}
rootProject.name = "KotlinMultiplatformDemo"


include(":androidApp")
include(":shared")

