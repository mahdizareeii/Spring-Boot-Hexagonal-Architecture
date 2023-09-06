package org.example.springboot.repository

import org.example.springboot.Message
import org.springframework.data.repository.CrudRepository

// this will implement all fun find, save, delete and... automatically
interface MessageRepository : CrudRepository<Message, String>