package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.apiClientBuilder.ResponseTemplate
import fr.docjyJ.tisseoLib.model.message.Message
import java.time.LocalDateTime

/**
 * The response class of a messages request.
 *
 * @property expirationDate The expiration date of the content.
 * @property lines Contains Messages.
 */

data class MessagesResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("messages")
    val messages: List<Message>
) : ResponseTemplate
