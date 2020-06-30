package fr.docjyJ.tisseoLib.model.message

import java.util.Date

data class MessagesResponse (
        val expirationDate: Date,
        val messages: List<Messages>
)
