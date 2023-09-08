package org.example.springboot.domain.service

import org.example.springboot.infrastructure.adapters.output.persistence.entity.MessageDto
import org.example.springboot.infrastructure.adapters.output.persistence.repository.MessageRepository
import org.springframework.stereotype.Service
import kotlin.jvm.optionals.toList

//TODO inject use cases here
@Service
class MessageService(
    val repository: MessageRepository
) {

    fun findMessage(): List<MessageDto> = repository.findAll().toList()

    fun findMessageById(id: String): List<MessageDto> = repository.findById(id).toList()

    fun save(messageDto: MessageDto) = repository.save(messageDto)

    fun deleteMessageById(id: String) = repository.deleteById(id)
}