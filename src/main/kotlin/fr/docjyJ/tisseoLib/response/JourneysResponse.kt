package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.journey.RoutePlannerResult
import java.time.LocalDateTime

data class JourneysResponse(
    @SerializedName("expirationDate")
    override val expirationDate: LocalDateTime,
    @SerializedName("routePlannerResult")
    val routePlannerResult: RoutePlannerResult
) : TisseoResponse
