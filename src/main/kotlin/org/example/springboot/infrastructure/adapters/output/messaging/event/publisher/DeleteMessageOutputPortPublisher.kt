package org.example.springboot.infrastructure.adapters.output.messaging.event.publisher

import org.example.springboot.core.port.out.DeleteMessageOutputPort
import org.example.springboot.infrastructure.adapters.output.messaging.event.MessageEvent
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class DeleteMessageOutputPortPublisher(
    private val applicationEventPublisher: ApplicationEventPublisher
) : DeleteMessageOutputPort {
    override fun messageDeleted(id: String) {
        applicationEventPublisher.publishEvent(MessageEvent.DeleteMessage(id))
    }
}