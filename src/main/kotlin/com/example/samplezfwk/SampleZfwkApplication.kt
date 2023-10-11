package com.example.samplezfwk

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(
    scanBasePackages = ["zfwk", "com.example"]
)
class SampleZfwkApplication

fun main(args: Array<String>) {
    runApplication<SampleZfwkApplication>(*args)
}
