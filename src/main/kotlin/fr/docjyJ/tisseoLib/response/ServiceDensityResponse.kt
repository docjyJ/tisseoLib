package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.apiClientBuilder.ResponseTemplate
import fr.docjyJ.tisseoLib.model.serviceDensity.Stop
import java.time.LocalDateTime

/**
 * The response class of a service density request.
 *
 * @property expirationDate The expiration date of the content.
 * @property distance The distance with the point.
 * @property isServiceNumberReached If is number reached.
 * @property serviceNumberReached Number reached.
 * @property stops List of Stop.
 */

data class ServiceDensityResponse(
    @SerializedName("distance")
    val distance: Int,
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("isServiceNumberReached")
    val isServiceNumberReached: Boolean,
    @SerializedName("serviceNumberReached")
    val serviceNumberReached: Int,
    @SerializedName("stops")
    val stops: List<Stop>
) : ResponseTemplate
