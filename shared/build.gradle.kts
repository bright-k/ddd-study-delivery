dependencies {
    implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
}

tasks {
    bootJar {
        enabled = false
    }
    jar {
        enabled = true
    }
}