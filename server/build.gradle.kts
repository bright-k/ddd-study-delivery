dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks {
    bootJar {
        enabled = true
    }
    jar {
        enabled = false
    }
}
