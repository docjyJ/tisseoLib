package fr.docjyJ.tisseoLib.model.netwotk


import com.google.gson.annotations.SerializedName
import java.time.LocalDateTime

data class NetworksResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("networks")
    val networks: List<Network>
)
