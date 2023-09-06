package org.example.springboot

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("MESSAGES")
data class Message(
    @Id
    val id: String?,
    val text: String
)
