package fr.docjyJ.tisseoLib.model.journey


import com.google.gson.annotations.SerializedName

data class JourneyX(
    @SerializedName("arrivalDateTime")
    val arrivalDateTime: String,
    @SerializedName("arrivalText")
    val arrivalText: Text,
    @SerializedName("chunks")
    val chunks: List<Chunk>,
    @SerializedName("co2_emissions")
    val co2Emissions: String,
    @SerializedName("departureDateTime")
    val departureDateTime: String,
    @SerializedName("duration")
    val duration: String
)
