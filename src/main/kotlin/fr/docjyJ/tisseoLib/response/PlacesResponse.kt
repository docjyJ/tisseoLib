package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.place.PlacesList
import java.time.LocalDateTime

data class PlacesResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("placesList")
    val placesList: PlacesList
)
