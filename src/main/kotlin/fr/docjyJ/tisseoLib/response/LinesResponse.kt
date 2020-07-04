package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.apiClientBuilder.connection.ResponseTemplate
import fr.docjyJ.tisseoLib.model.line.Lines
import java.time.LocalDateTime

/**
 * The response class of a lines request.
 *
 * @property expirationDate The expiration date of the content.
 */

data class LinesResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("lines")
    val lines: Lines
) : ResponseTemplate
