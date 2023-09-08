// ConsoleAdapter.kt
package org.example.springboot.infrastructure.adapters.output.console

import org.example.springboot.core.port.out.GetMessageOutputPort
import org.example.springboot.core.domain.model.Message

class ConsoleAdapter : GetMessageOutputPort {
    override fun displayMessage(message: Message?) {
        if (message != null) {
            println("Product: ${message.id}, Price: ${message.text}")
        } else {
            println("Product not found.")
        }
    }
}
