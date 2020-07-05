package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.apiClientBuilder.ResponseTemplate
import fr.docjyJ.tisseoLib.model.place.PlacesList
import java.time.LocalDateTime

/**
 * The response class of a places request.
 *
 * @property expirationDate The expiration date of the content.
 * @property placesList Contains Places.
 */

data class PlacesResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("placesList")
    val placesList: PlacesList
) : ResponseTemplate
