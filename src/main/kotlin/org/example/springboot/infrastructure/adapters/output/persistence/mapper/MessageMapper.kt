package org.example.springboot.infrastructure.adapters.output.persistence.mapper

import org.example.springboot.core.domain.model.Message
import org.example.springboot.infrastructure.adapters.output.persistence.entity.MessageDto

object MessageMapper {
    fun toDto(message: Message): MessageDto = MessageDto(message.id, message.text)
    fun toDomain(messageDto: MessageDto): Message = Message(messageDto.id, messageDto.text)
}