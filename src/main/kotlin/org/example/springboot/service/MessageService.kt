package org.example.springboot.service

import org.example.springboot.dto.Message
import org.example.springboot.repository.MessageRepository
import org.springframework.stereotype.Service
import kotlin.jvm.optionals.toList

@Service
class MessageService(
    val repository: MessageRepository
) {

    fun findMessage(): List<Message> = repository.findAll().toList()

    fun findMessageById(id: String): List<Message> = repository.findById(id).toList()

    fun save(message: Message) = repository.save(message)
}