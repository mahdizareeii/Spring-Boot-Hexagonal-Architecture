package org.example.springboot

import org.springframework.web.bind.annotation.*

@RestController
class MessageController(
    val service: MessageService
) {
    @GetMapping("/")
    fun index() = "hello to my project"

    @GetMapping("/hello")
    fun hello(@RequestParam("name") name: String) = "Hello $name"

    @GetMapping("/getMessages")
    fun getMessages() = service.findMessage()

    @PostMapping("/postMessage")
    fun postMessage(
        @RequestBody message: Message
    ) {
        service.save(message)
    }
}