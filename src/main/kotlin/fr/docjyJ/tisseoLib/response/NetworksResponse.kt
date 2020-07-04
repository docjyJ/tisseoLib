package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.apiClientBuilder.connection.ResponseTemplate
import fr.docjyJ.tisseoLib.model.netwotk.Network
import java.time.LocalDateTime

/**
 * The response class of a networks request.
 *
 * @property expirationDate The expiration date of the content.
 */

data class NetworksResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("networks")
    val networks: List<Network>
) : ResponseTemplate
