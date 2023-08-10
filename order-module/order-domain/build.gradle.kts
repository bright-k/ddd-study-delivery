dependencies {
    api(project(":shared"))
    implementation("org.hibernate.orm:hibernate-core:6.2.7.Final")
}

tasks {
    bootJar {
        enabled = false
    }
    jar {
        enabled = true
    }
}