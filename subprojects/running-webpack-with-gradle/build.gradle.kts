plugins {
    id("org.gradle.guides")
}

guide {
    repositoryPath.set("gradle-guides/running-webpack-with-gradle")
    minimumGradleVersion.set("4.10.3")
    displayName.set("Running Webpack with Gradle")
    category.set("Getting Started")
}

tasks.named("asciidoctorContentDocsTest") {
    enabled = false
}
