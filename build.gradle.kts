// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
}

publishing {
    publications {
        create("maven_public", MavenPublication::class) {
            groupId = "org.gradle.sample"
            artifactId = "library"
            version = "1.1"
            from(components.getByName("java"))
        }
    }
}
