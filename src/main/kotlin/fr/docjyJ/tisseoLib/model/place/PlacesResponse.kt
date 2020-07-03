package fr.docjyJ.tisseoLib.model.place


import com.google.gson.annotations.SerializedName
import java.time.LocalDateTime

data class PlacesResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("placesList")
    val placesList: PlacesList
)
