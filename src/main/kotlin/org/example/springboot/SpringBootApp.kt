package org.example.springboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SpringBootApp

fun main(args: Array<String>) {
    runApplication<SpringBootApp>(*args)
}

@RestController
class MessageController {
    @GetMapping("/")
    fun index(@RequestParam("name") name:String) = "Hello $name"

    @GetMapping("/test")
    fun test() = listOf(
        Message("1","test"),
        Message("2","test2"),
    )
}