import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

group = "org.zmx"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.8.2")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
//    println()
//    println("${project.buildDir}/resources/logging-test.properties")
//    println()
//    systemProperty("java.util.logging.config.file", "${project.buildDir}/resources/test/logging-test.properties")
//
//    setForkEvery(1)
//
//    testLogging {
//        showStandardStreams = true
//    }
}

//tasks.withType(Test).configureEach {
//    useJUnitPlatform()
//
//    systemProperty 'java.util.logging.config.file', "${project.buildDir}/resources/test/logging-test.properties"
//
//    forkEvery = 1
//
//    testLogging {
//        showStandardStreams = true
//    }
//}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}