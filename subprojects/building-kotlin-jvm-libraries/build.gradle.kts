plugins {
    id("org.gradle.guides")
}

guide {
    repositoryPath.set("gradle-guides/building-kotlin-jvm-libraries")
    minimumGradleVersion.set("5.0")
    displayName.set("Building Kotlin JVM Libraries")
    category.set("Getting Started")
}

// TODO: Require seed sample
tasks.named("asciidoctorContentDocsTest") {
    enabled = false
}
