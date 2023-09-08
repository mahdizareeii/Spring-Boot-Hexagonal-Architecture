package org.example.springboot.infrastructure.adapters.output.messaging.event.publisher

import org.example.springboot.core.domain.model.Message
import org.example.springboot.core.port.out.GetMessageOutputPort
import org.example.springboot.infrastructure.adapters.output.messaging.event.MessageEvent
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class GetMessageOutputPortPublisher(
    private val applicationEventPublisher: ApplicationEventPublisher
) : GetMessageOutputPort {
    override fun displayMessage(message: Message?) {
        applicationEventPublisher.publishEvent(MessageEvent.GetMessage(message ?: Message("null", "null")))
    }
}