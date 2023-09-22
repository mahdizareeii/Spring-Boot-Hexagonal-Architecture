import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.1.3"
    id("io.spring.dependency-management") version "1.1.2"
    kotlin("jvm") version "1.9.0" // The version of Kotlin to use
    kotlin("plugin.spring") version "1.9.10" // The Kotlin Spring plugin
    application
}

group = "org.example.springboot"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    //a Java SQL database engine that can be used in embedded or server modes
    //It is an open-source database that supports JDBC API and provides features such as in-memory databases,
    //transaction support, multi-version concurrency, and full-text search
    runtimeOnly("com.h2database:h2")

    // object-relational mapping (ORM) framework that provides abstractions for the JDBC-based data access layer
    // It focuses on the concepts of aggregates and entities as defined in domain-driven design (DDD)
    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")

    // By using this starter dependency, developers can quickly set up a web application
    // without having to manually configure the web server and dependencies
    implementation("org.springframework.boot:spring-boot-starter-web")

    // Jackson's extensions for Kotlin for working with JSON
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    // Kotlin's reflection library, required for working with Spring
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    //  provides support for testing Spring Boot applications
    // It includes several testing frameworks and libraries, such as JUnit, AssertJ, Hamcrest, and Mockito, among others
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    // provides support for writing and running tests in Kotlin projects
    testImplementation(kotlin("test"))
}

tasks.withType<KotlinCompile> { // Settings for `KotlinCompile` tasks
    kotlinOptions { // Kotlin compiler options
        freeCompilerArgs = listOf("-Xjsr305=strict") // `-Xjsr305=strict` enables the strict mode for JSR-305 annotations
        jvmTarget = "17" // This option specifies the target version of the generated JVM bytecode
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

/*
application {
    mainClass.set("MainKt")
}*/
