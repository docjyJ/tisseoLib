package fr.docjyJ.tisseoLib.model.message


import com.google.gson.annotations.SerializedName
import java.time.LocalDateTime

data class MessagesResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("messages")
    val messages: List<Message>
)
