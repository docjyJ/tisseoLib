package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.stopArea.StopAreas
import java.time.LocalDateTime

/**
 * The response class of a stop areas request.
 *
 * @property expirationDate The expiration date of the content.
 */

data class StopAreaResponse(
    @SerializedName("expirationDate")
    override val expirationDate: LocalDateTime,
    @SerializedName("stopAreas")
    val stopAreas: StopAreas
) : TisseoResponse
