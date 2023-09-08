package org.example.springboot.core.port.`in`

import org.example.springboot.core.port.out.DeleteMessageOutputPort
import org.example.springboot.infrastructure.adapters.output.persistence.repository.MessageRepository

class DeleteMessageByIdUseCase(
    private val repository: MessageRepository,
    private val deleteMessageOutputPort: DeleteMessageOutputPort,
) {
    fun deleteMessage(id: String) {
        repository.deleteById(id)
        deleteMessageOutputPort.messageDeleted(id)
    }
}