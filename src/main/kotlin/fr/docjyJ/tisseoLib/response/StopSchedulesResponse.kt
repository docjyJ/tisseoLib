package fr.docjyJ.tisseoLib.response


import com.google.gson.annotations.SerializedName
import fr.docjyJ.apiClientBuilder.ResponseTemplate
import fr.docjyJ.tisseoLib.model.stopSchedule.Departures
import java.time.LocalDateTime

/**
 * The response class of a stop schedules request.
 *
 * @property expirationDate The expiration date of the content.
 * @property departures Contains Departures.
 */

data class StopSchedulesResponse (
    @SerializedName("departures")
    val departures: Departures,
    @SerializedName("expirationDate")
    val expirationDate: LocalDateTime
) : ResponseTemplate
