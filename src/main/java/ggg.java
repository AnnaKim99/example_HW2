plugins {
        id 'java-library'
        }

        repositories {
        mavenCentral()
        }

        dependencies {
        testImplementation (
        "com.codeborne:selenide:6.16.0",
        "org.junit.jupiter:junit-jupiter:5.9.3")
        }

        tasks.withType(JavaCompile) {
        options.encoding = 'UTF-8'
        }

        test {
        useJUnitPlatform()
        }