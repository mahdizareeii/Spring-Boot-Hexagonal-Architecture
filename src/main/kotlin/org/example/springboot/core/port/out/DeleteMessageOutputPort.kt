package org.example.springboot.core.port.out

interface DeleteMessageOutputPort {
    fun messageDeleted(id: String)
}