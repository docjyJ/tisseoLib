package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.exception.TisseoClientException
import fr.docjyJ.tisseoLib.model.journey.JourneysResponse
import fr.docjyJ.tisseoLib.exception.TisseoServerException
import java.time.LocalDateTime

/**
 * The class builder to do a Journeys request.
 *
 * @constructor Create new request builder with no parameters.
 *
 * @property departurePlace Departure address or stop name.
 * @property departurePlaceXY Departure coordinates.
 * @property arrivalPlace Arrival address or stop name.
 * @property arrivalPlaceXY The arrivalPlaceXY propriety.
 * @property srid Spatial reference number projection. [see](https://en.wikipedia.org/wiki/SRID)
 * @property networkList Network Transport operators number.
 * @property firstDepartureDatetime First date time of departure.
 * @property lastDepartureDatetime Last date time of departure.
 * @property maxTransferDuration Is the maximum travel time.
 * @property maxTransferNumber Specifies the maximum number of matches to use.
 * @property roadMode Specifies the mode in which the portions are made of any path "Transit" at the beginning (unless a "startRoadMode" different is specified) or at the end of the journey.
 * @property roadSpeed Velocity (meter by seconds) of selected roadMode.
 * @property roadMaxDistance Maximum distance of all road sections (unless a different startRoadMaxDistance specified) including the begining and the end of the journey.
 * @property startRoadMode Conveyance with which to perform the portion of the road path at the beginning of the journey.
 * @property startRoadSpeed Speed (meter by seconds) of selected roadMode.
 * @property startRoadMaxDistance Maximum distance for departure road section.
 * @property rollingStockList Rolling Stock List (Bus, Metro, Tram, ...) to take into account in the calculation.
 * @property number Max number of results.
 * @property displayResultTable Add routes summary in table form.
 * @property displayWording Returns human description for each section of the course.
 * @property displayMessages Returns in extra id, service disruption messages.
 * @property maxApproachDistance Maximum walking distance.
 */

@Suppress("MemberVisibilityCanBePrivate")
class JourneysRequest(private val apiKey: String){
    var departurePlace:String? = null
    var departurePlaceXY:String? = null
    var arrivalPlace:String? = null
    var arrivalPlaceXY:String? = null
    var srid:String? = null
    var networkList:String? = null
    var firstDepartureDatetime:LocalDateTime? = null
    var lastDepartureDatetime:LocalDateTime? = null
    var maxTransferDuration:String? = null
    var maxTransferNumber:String? = null
    var roadMode:String? = null
    var roadSpeed:Float? = null
    var roadMaxDistance:String? = null
    var startRoadMode:String? = null
    val startRoadSpeed:Float? = null
    var startRoadMaxDistance:String? = null
    var rollingStockList:String? = null
    var number:Int? = null
    var displayResultTable:Boolean? = null
    var displayWording:Boolean? = null
    var displayMessages:Boolean? = null
    var maxApproachDistance:String? = null

    private fun buildParams() = RequestBuilder(apiKey, "journeys").apply {
        addParameter("departurePlace",departurePlace)
        addParameter("departurePlaceXY",departurePlaceXY)
        addParameter("arrivalPlace",arrivalPlace)
        addParameter("arrivalPlaceXY",arrivalPlaceXY)
        addParameter("srid",srid)
        addParameter("networkList",networkList)
        addParameter("firstDepartureDatetime",firstDepartureDatetime)
        addParameter("lastDepartureDatetime",lastDepartureDatetime)
        addParameter("maxTransferDuration",maxTransferDuration)
        addParameter("maxTransferNumber",maxTransferNumber)
        addParameter("roadMode",roadMode)
        addParameter("roadSpeed",roadSpeed)
        addParameter("roadMaxDistance",roadMaxDistance)
        addParameter("startRoadMode",startRoadMode)
        addParameter("startRoadSpeed", startRoadSpeed)
        addParameter("startRoadMaxDistance",startRoadMaxDistance)
        addParameter("rollingStockList",rollingStockList)
        addParameter("number",number)
        addParameter("displayResultTable",displayResultTable)
        addParameter("displayWording",displayWording)
        addParameter("displayMessages",displayMessages)
        addParameter("maxApproachDistance",maxApproachDistance)
    }

    /**
     * Execute the request.
     * @return Response of request in JourneysResponse object.
     * @throws  TisseoServerException
     */
    @Throws(TisseoServerException::class, TisseoClientException::class)
    fun execute() = buildParams().execute(JourneysResponse::class.java)

    /**
     * Execute the request.
     * @return Response of request in String object.
     * @throws  TisseoServerException
     */
    @Throws(TisseoServerException::class, TisseoClientException::class)
    fun executeAsString() = buildParams().execute()
}
