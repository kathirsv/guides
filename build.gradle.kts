plugins {
    id("org.gradle.guides.tutorial") version "0.14.0"
    id("com.gradle.build-scan") version "2.3"

    // Uncomment this line if you need test JVM code snippets
    // id("org.gradle.guides.test-jvm-code") version "0.14.0"
}

configure<org.gradle.guides.GuidesExtension> {
    repoPath = "gradle-guides/@@GUIDE_SLUG@@"
    mainAuthor = "EDIT build.gradle TO ADD AUTHOR"
}

buildScan {
    setTermsOfServiceUrl("https://gradle.com/terms-of-service")
    setTermsOfServiceAgree("yes")
    if (!System.getenv("CI").isNullOrEmpty()) {
        publishAlways()
        tag("CI")
    }
}
