package org.example.springboot

import org.example.springboot.infrastructure.adapters.output.persistence.entity.MessageDto
import org.example.springboot.infrastructure.adapters.output.persistence.repository.MessageRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ProjectConfiguration {

    @Bean
    fun dataBaseDefaultDataInitializer(
        repository: MessageRepository
    ) = ApplicationRunner {
        repository.save(MessageDto(null,"test text"))
    }

}