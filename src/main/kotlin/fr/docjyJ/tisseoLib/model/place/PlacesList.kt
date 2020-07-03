package fr.docjyJ.tisseoLib.model.place


import com.google.gson.annotations.SerializedName

data class PlacesList(
    @SerializedName("origin")
    val origin: Origin,
    @SerializedName("place")
    val place: List<Place>
)
