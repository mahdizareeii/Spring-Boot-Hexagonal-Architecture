package org.example.springboot.infrastructure.adapters.output.messaging.event

import org.example.springboot.core.port.out.GetMessagesOutputPort
import org.example.springboot.infrastructure.adapters.output.persistence.entity.MessageDto
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class GetMessagesOutputPortPublisher(
    private val applicationEventPublisher: ApplicationEventPublisher
) : GetMessagesOutputPort {

    override fun displayMessages(messages: List<MessageDto>) {
        messages.forEach { message ->
            applicationEventPublisher.publishEvent("returned message $message")
        }
    }
}