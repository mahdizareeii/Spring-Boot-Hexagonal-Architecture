package org.example.springboot.infrastructure.adapters.output.messaging.event

import org.example.springboot.core.domain.model.Message
import org.example.springboot.core.port.out.SaveMessageOutputPort
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class SaveMessageOutputPortPublisher(
    private val applicationEventPublisher: ApplicationEventPublisher
) : SaveMessageOutputPort {

    override fun saveMessage(message: Message) {
        applicationEventPublisher.publishEvent("message $message saved")
    }
}