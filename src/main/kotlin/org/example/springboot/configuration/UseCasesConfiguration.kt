package org.example.springboot.configuration

import org.example.springboot.core.port.`in`.DeleteMessageByIdUseCase
import org.example.springboot.core.port.`in`.GetMessageByIdUseCase
import org.example.springboot.core.port.`in`.GetMessagesUseCase
import org.example.springboot.core.port.`in`.SaveMessageUseCase
import org.example.springboot.core.port.out.DeleteMessageOutputPort
import org.example.springboot.core.port.out.GetMessageOutputPort
import org.example.springboot.core.port.out.GetMessagesOutputPort
import org.example.springboot.core.port.out.SaveMessageOutputPort
import org.example.springboot.infrastructure.adapters.output.persistence.mapper.MessageMapper
import org.example.springboot.infrastructure.adapters.output.persistence.repository.MessageRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UseCasesConfiguration {

    @Bean
    fun deleteMessageByIdUseCaseProvider(
        repository: MessageRepository,
        deleteMessageOutputPort: DeleteMessageOutputPort
    ) = DeleteMessageByIdUseCase(repository, deleteMessageOutputPort)

    @Bean
    fun getMessageByIdUseCaseProvider(
        repository: MessageRepository,
        getMessageOutputPort: GetMessageOutputPort
    ) = GetMessageByIdUseCase(repository, getMessageOutputPort, MessageMapper)

    @Bean
    fun getMessagesUseCaseProvider(
        repository: MessageRepository,
        getMessagesOutPort: GetMessagesOutputPort,
    ) = GetMessagesUseCase(repository, getMessagesOutPort, MessageMapper)

    @Bean
    fun saveMessageUseCaseProvider(
        repository: MessageRepository,
        saveMessageOutputPort: SaveMessageOutputPort,
    ) = SaveMessageUseCase(repository, saveMessageOutputPort, MessageMapper)


}