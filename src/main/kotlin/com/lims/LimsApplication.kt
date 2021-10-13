package com.lims

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class LimsApplication

fun main(args: Array<String>) {
    runApplication<LimsApplication>(*args)
}
