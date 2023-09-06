package org.example.springboot

import org.example.springboot.dto.Message
import org.example.springboot.repository.MessageRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ProjectConfiguration {

    @Bean
    fun dataBaseDefaultDataInitializer(
        repository: MessageRepository
    ) = ApplicationRunner {
        repository.save(Message(null,"test text"))
    }

}