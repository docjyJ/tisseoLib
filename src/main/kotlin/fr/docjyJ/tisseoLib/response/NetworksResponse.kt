package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.netwotk.Network
import java.time.LocalDateTime

data class NetworksResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("networks")
    val networks: List<Network>
)
