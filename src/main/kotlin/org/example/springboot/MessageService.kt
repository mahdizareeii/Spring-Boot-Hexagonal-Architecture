package org.example.springboot

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service
import java.util.*

@Service
class MessageService(
    val db: JdbcTemplate
) {

    fun findMessage(): List<Message> = db.query("select * from messages") { response, _ ->
        Message(
            id = response.getString("id"),
            text = response.getString("text")
        )
    }

    fun save(message: Message) {
        val id = message.id ?: UUID.randomUUID().toString()
        db.update("insert into messages values ( ?, ? )", id, message.text)
    }

}