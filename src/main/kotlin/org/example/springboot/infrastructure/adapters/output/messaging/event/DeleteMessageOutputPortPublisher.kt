package org.example.springboot.infrastructure.adapters.output.messaging.event

import org.example.springboot.core.port.out.DeleteMessageOutputPort
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class DeleteMessageOutputPortPublisher(
    private val applicationEventPublisher: ApplicationEventPublisher
) : DeleteMessageOutputPort {
    override fun messageDeleted(id: String) {
        applicationEventPublisher.publishEvent("message deleted $id")
    }
}