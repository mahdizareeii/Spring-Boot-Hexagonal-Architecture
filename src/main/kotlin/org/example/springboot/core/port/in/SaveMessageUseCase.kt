package org.example.springboot.core.port.`in`

import org.example.springboot.core.mapper.MessageMapper
import org.example.springboot.core.port.out.SaveMessageOutputPort
import org.example.springboot.domain.model.Message
import org.example.springboot.infrastructure.adapters.output.persistence.repository.MessageRepository

class SaveMessageUseCase(
    private val repository: MessageRepository,
    private val saveMessageOutputPort: SaveMessageOutputPort,
    private val mapper: MessageMapper
) {
    fun saveMessage(message: Message) {
        val messageDto = mapper.toDto(message)
        repository.save(messageDto)
        saveMessageOutputPort.saveMessage(message)
    }
}