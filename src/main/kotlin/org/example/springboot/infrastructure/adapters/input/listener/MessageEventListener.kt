package org.example.springboot.infrastructure.adapters.input.listener

import org.example.springboot.infrastructure.adapters.output.messaging.event.MessageEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component

@Component
class MessageEventListener {

    @EventListener
    fun eventListener(event: MessageEvent) {
        println("Message Event Publisher Listener : $event")
    }

}