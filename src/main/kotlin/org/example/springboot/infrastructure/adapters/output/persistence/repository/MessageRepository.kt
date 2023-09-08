package org.example.springboot.infrastructure.adapters.output.persistence.repository

import org.example.springboot.infrastructure.adapters.output.persistence.entity.MessageDto
import org.springframework.data.repository.CrudRepository

//CrudRepository mainly provides CRUD functions.
//PagingAndSortingRepository provides methods to do pagination and sorting records.
//JpaRepository provides some JPA-related methods such as flushing the persistence context and deleting records in a batch.

// this will implement all fun find, save, delete and... automatically
interface MessageRepository : CrudRepository<MessageDto, String>