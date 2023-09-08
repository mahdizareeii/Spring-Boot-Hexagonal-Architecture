package org.example.springboot.infrastructure.adapters.output.persistence.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("MESSAGES")
data class MessageDto(
    @Id
    val id: String?,
    val text: String
)
