package org.example.springboot.infrastructure.adapters.output.messaging.event.publisher

import org.example.springboot.core.domain.model.Message
import org.example.springboot.core.port.out.GetMessagesOutputPort
import org.example.springboot.infrastructure.adapters.output.messaging.event.MessageEvent
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component

@Component
class GetMessagesOutputPortPublisher(
    private val applicationEventPublisher: ApplicationEventPublisher
) : GetMessagesOutputPort {

    override fun displayMessages(messages: List<Message>) {
        applicationEventPublisher.publishEvent(MessageEvent.GetMessages(messages))
    }
}