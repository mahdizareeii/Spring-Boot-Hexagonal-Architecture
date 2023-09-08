package org.example.springboot.core.domain.service

import org.example.springboot.core.domain.model.Message
import org.example.springboot.core.port.`in`.DeleteMessageByIdUseCase
import org.example.springboot.core.port.`in`.GetMessageByIdUseCase
import org.example.springboot.core.port.`in`.GetMessagesUseCase
import org.example.springboot.core.port.`in`.SaveMessageUseCase
import org.springframework.stereotype.Service

@Service
class MessageService(
    private val saveMessageUseCase: SaveMessageUseCase,
    private val getMessagesUseCase: GetMessagesUseCase,
    private val getMessageByIdUseCase: GetMessageByIdUseCase,
    private val deleteMessageByIdUseCase: DeleteMessageByIdUseCase
) {
    fun saveMessage(message: Message) = saveMessageUseCase.saveMessage(message)

    fun getMessages(): List<Message> = getMessagesUseCase.getMessages()

    fun getMessageById(id: String): Message? = getMessageByIdUseCase.getMessage(id)

    fun deleteMessageById(id: String) = deleteMessageByIdUseCase.deleteMessage(id)
}