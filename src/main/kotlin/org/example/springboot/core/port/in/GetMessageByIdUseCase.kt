package org.example.springboot.core.port.`in`

import org.example.springboot.infrastructure.adapters.output.persistence.mapper.MessageMapper
import org.example.springboot.core.port.out.GetMessageOutputPort
import org.example.springboot.core.domain.model.Message
import org.example.springboot.infrastructure.adapters.output.persistence.repository.MessageRepository
import kotlin.jvm.optionals.toList

class GetMessageByIdUseCase(
    private val repository: MessageRepository,
    private val getMessageOutPort: GetMessageOutputPort,
    private val mapper: MessageMapper
) {

    fun getMessage(id: String): Message? {
        val message = repository.findById(id).toList().map { mapper.toDomain(it) }.firstOrNull()
        getMessageOutPort.displayMessage(message)
        return message
    }
}