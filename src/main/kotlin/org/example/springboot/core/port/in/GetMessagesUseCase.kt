package org.example.springboot.core.port.`in`

import org.example.springboot.core.domain.model.Message
import org.example.springboot.core.port.out.GetMessagesOutputPort
import org.example.springboot.infrastructure.adapters.output.persistence.mapper.MessageMapper
import org.example.springboot.infrastructure.adapters.output.persistence.repository.MessageRepository

class GetMessagesUseCase(
    private val repository: MessageRepository,
    private val getMessagesOutPort: GetMessagesOutputPort,
    private val mapper: MessageMapper
) {
    fun getMessages(): List<Message> {
        val messages = repository.findAll().toList().map { mapper.toDomain(it) }
        getMessagesOutPort.displayMessages(messages)
        return messages
    }
}