package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.apiClientBuilder.ResponseTemplate
import fr.docjyJ.tisseoLib.model.journey.RoutePlannerResult
import java.time.LocalDateTime

/**
 * The response class of a journeys request.
 *
 * @property expirationDate The expiration date of the content.
 */

data class JourneysResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("routePlannerResult")
    val routePlannerResult: RoutePlannerResult
) : ResponseTemplate
