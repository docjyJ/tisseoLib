package fr.docjyJ.tisseoLib.model.journey


import com.google.gson.annotations.SerializedName

data class RoutePlannerResult(
    @SerializedName("journeys")
    val journeys: List<Journey>,
    @SerializedName("query")
    val query: Query
)
