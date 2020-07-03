package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.message.Message
import java.time.LocalDateTime

data class MessagesResponse(
    @SerializedName("expirationDate")
    override val expirationDate: LocalDateTime,
    @SerializedName("messages")
    val messages: List<Message>
) : TisseoResponse
