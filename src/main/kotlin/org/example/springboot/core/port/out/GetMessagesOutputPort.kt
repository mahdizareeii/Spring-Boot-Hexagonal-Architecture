package org.example.springboot.core.port.out

import org.example.springboot.infrastructure.adapters.output.persistence.entity.MessageDto

interface GetMessagesOutputPort {
    fun displayMessages(messages: List<MessageDto>)
}