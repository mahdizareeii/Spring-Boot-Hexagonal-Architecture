package org.example.springboot.infrastructure.adapters.input.rest

import org.example.springboot.infrastructure.adapters.output.persistence.entity.MessageDto
import org.example.springboot.domain.service.MessageService
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
        @RequestBody messageDto: MessageDto
    ) {
        service.save(messageDto)
    }

    @DeleteMapping("/deleteMessageById/{id}")
    fun deleteMessageById(
        @PathVariable id: String
    ) = service.deleteMessageById(id)
}