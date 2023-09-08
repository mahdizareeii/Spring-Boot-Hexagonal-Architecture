package org.example.springboot.core.port.out

import org.example.springboot.domain.model.Message

interface SaveMessageOutputPort {
    fun saveMessage(message: Message)
}