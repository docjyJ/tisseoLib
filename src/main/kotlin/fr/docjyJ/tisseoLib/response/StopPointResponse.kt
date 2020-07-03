package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.tisseoLib.model.stopPoint.PhysicalStops
import java.time.LocalDateTime

/**
 * The response class of a stop points request.
 *
 * @property expirationDate The expiration date of the content.
 */

data class StopPointResponse(
    @SerializedName("expirationDate")
    override val expirationDate: LocalDateTime,
    @SerializedName("physicalStops")
    val physicalStops: PhysicalStops
) : TisseoResponse
