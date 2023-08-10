package com.tossplace.ddd.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DddApplication

fun main(args: Array<String>) {
    runApplication<DddApplication>(*args)
}
