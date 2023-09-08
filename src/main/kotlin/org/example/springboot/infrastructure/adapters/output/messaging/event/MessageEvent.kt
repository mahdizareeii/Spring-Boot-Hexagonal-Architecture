package org.example.springboot.infrastructure.adapters.output.messaging.event

import org.example.springboot.core.domain.model.Message
import org.springframework.context.ApplicationEvent

sealed class MessageEvent(source: Any) : ApplicationEvent(source) {
    data class DeleteMessage(val id: String) : MessageEvent(id)
    data class GetMessage(val message: Message) : MessageEvent(message)
    data class GetMessages(val messages: List<Message>) : MessageEvent(messages)
    data class SaveMessage(val message: Message) : MessageEvent(message)
}