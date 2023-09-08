package org.example.springboot.core.port.out

import org.example.springboot.domain.model.Message

interface GetMessageOutputPort {
    fun displayMessage(message: Message?)
}