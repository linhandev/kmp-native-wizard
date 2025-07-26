buildscript {
    repositories {
        mavenLocal()
        maven {
            url = uri("/Volumes/disk/git/kmp/kotlin22-ohos/build/repo")
        }
        mavenCentral()
    }
}

plugins {
    alias(libs.plugins.kotlinMultiplatform)
}

group = "me.user"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    maven {
        url = uri("/Volumes/disk/git/kmp/kotlin22-ohos/build/repo")
    }
    mavenCentral()
}

kotlin {
    macosArm64() {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }

    ohosArm64() {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }

    sourceSets {
        commonMain {
            kotlin.srcDirs("src/commonMain/kotlin")
        }
        macosArm64Main {
            kotlin.srcDirs("src/macMain/kotlin")
        }
        ohosArm64Main {
            kotlin.srcDirs("src/ohosMain/kotlin")
        }
    }
}
