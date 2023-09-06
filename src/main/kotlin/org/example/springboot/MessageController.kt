package org.example.springboot

import org.springframework.web.bind.annotation.*

@RestController
class MessageController(
    val service: MessageService
) {
    @GetMapping("/hello")
    fun hello(@RequestParam("name") name: String) = "Hello $name"

    @GetMapping("/")
    fun getMessages() = service.findMessage()

    @PostMapping("/")
    fun post(
        @RequestBody message: Message
    ) {
        service.save(message)
    }
}