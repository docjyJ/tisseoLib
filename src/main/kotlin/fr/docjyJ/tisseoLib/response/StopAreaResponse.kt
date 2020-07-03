package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.stopArea.StopAreas
import java.time.LocalDateTime

data class StopAreaResponse(
    @SerializedName("expirationDate")
    override val expirationDate: LocalDateTime,
    @SerializedName("stopAreas")
    val stopAreas: StopAreas
) : TisseoResponse
