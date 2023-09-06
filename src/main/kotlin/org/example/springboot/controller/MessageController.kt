package org.example.springboot.controller

import org.example.springboot.dto.Message
import org.example.springboot.service.MessageService
import org.springframework.web.bind.annotation.*

@RestController
class MessageController(
    val service: MessageService
) {
    @GetMapping("/")
    fun index() = "hello to my project"

    @GetMapping("/hello")
    fun hello(@RequestParam("name") name: String) = "Hello $name"

    @GetMapping("/getMessageById/{id}")
    fun getMessageById(
        @PathVariable id: String
    ) = service.findMessageById(id)

    @GetMapping("/getMessages")
    fun getMessages() = service.findMessage()

    @PostMapping("/postMessage")
    fun postMessage(
        @RequestBody message: Message
    ) {
        service.save(message)
    }
}