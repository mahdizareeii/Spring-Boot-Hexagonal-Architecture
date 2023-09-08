package org.example.springboot.infrastructure.adapters.input.rest

import org.example.springboot.core.domain.model.Message
import org.example.springboot.core.domain.service.MessageService
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
    ) = service.getMessageById(id)

    @GetMapping("/getMessages")
    fun getMessages() = service.getMessages()

    @PostMapping("/postMessage")
    fun postMessage(
        @RequestBody message: Message
    ) {
        service.saveMessage(message)
    }

    @DeleteMapping("/deleteMessageById/{id}")
    fun deleteMessageById(
        @PathVariable id: String
    ) = service.deleteMessageById(id)
}