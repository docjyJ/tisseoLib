package fr.docjyJ.tisseoLib.model.message

import java.time.LocalDateTime

data class MessagesResponse (
        val expirationDate: LocalDateTime,
        val messages: List<Messages>
)
