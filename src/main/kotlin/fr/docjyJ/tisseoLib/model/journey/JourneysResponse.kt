package fr.docjyJ.tisseoLib.model.journey


import com.google.gson.annotations.SerializedName
import java.time.LocalDateTime

data class JourneysResponse(
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime,
    @SerializedName("routePlannerResult")
    val routePlannerResult: RoutePlannerResult
)
