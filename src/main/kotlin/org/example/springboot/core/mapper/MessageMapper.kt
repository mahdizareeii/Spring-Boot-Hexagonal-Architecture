package org.example.springboot.core.mapper

import org.example.springboot.infrastructure.adapters.output.persistence.entity.MessageDto
import org.example.springboot.domain.model.Message

class MessageMapper {
    fun toDto(message: Message): MessageDto = MessageDto(message.id, message.text)
    fun toDomain(messageDto: MessageDto): Message = Message(messageDto.id, messageDto.text)
}