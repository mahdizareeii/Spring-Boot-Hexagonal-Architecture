package org.example.springboot.core.port.out

import org.example.springboot.core.domain.model.Message

interface GetMessagesOutputPort {
    fun displayMessages(messages: List<Message>)
}