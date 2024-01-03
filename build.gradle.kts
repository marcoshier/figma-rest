plugins {
    kotlin("multiplatform") version "1.9.22"
    kotlin("plugin.serialization") version "1.9.22"
    `maven-publish`
}

group = "org.openrndr"
version = "0.1-SNAPSHOT"

repositories {
    mavenCentral()
}


kotlin {

    jvm {
    }

    jvmToolchain(19)

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
            }
        }

        val commonTest by getting {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-test")
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation("com.squareup.okhttp3:okhttp:4.12.0")
            }
        }
    }
}