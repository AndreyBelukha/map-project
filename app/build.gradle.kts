plugins {
    kotlin("jvm") version "1.9.24"

    id("org.springframework.boot") version("2.7.8")
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:2.7.8"))
    implementation("org.springframework.boot:spring-boot-starter")
}

repositories {
    mavenCentral()
}