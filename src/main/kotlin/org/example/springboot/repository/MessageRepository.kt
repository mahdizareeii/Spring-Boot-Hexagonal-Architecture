package org.example.springboot.repository

import org.example.springboot.dto.Message
import org.springframework.data.repository.CrudRepository

//CrudRepository mainly provides CRUD functions.
//PagingAndSortingRepository provides methods to do pagination and sorting records.
//JpaRepository provides some JPA-related methods such as flushing the persistence context and deleting records in a batch.

// this will implement all fun find, save, delete and... automatically
interface MessageRepository : CrudRepository<Message, String>