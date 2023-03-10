plugins {
    id("java")
}

group = "dev.talosdx"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly( "org.projectlombok:lombok:1.18.24")
    annotationProcessor( "org.projectlombok:lombok:1.18.24")

    testCompileOnly( "org.projectlombok:lombok:1.18.24")
    testAnnotationProcessor( "org.projectlombok:lombok:1.18.24")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}