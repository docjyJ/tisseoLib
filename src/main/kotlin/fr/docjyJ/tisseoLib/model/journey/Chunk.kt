package fr.docjyJ.tisseoLib.model.journey


import com.google.gson.annotations.SerializedName

data class Chunk(
    @SerializedName("service")
    val service: Service,
    @SerializedName("stop")
    val stop: Stop
)
