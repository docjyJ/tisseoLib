@file:Suppress("MemberVisibilityCanBePrivate")

package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.anotation.EndpointURL
import fr.docjyJ.apiClientBuilder.anotation.QueryParameter
import fr.docjyJ.tisseoLib.response.JourneysResponse
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
 * @property roadMaxDistance Maximum distance of all road sections (unless a different startRoadMaxDistance specified) including the beginning and the end of the journey.
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

class JourneysRequest(
        @QueryParameter("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<JourneysResponse>(JourneysResponse::class.java) {
    @EndpointURL
    val endpointURL = "https://api.tisseo.fr/v1/journeys.json"

    @QueryParameter("departurePlace")
    var departurePlace:String? = null
    @QueryParameter("departurePlaceXY")
    var departurePlaceXY:String? = null
    @QueryParameter("arrivalPlace")
    var arrivalPlace:String? = null
    @QueryParameter("arrivalPlaceXY")
    var arrivalPlaceXY:String? = null
    @QueryParameter("srid")
    var srid:String? = null
    @QueryParameter("networkList")
    var networkList:String? = null
    @QueryParameter("firstDepartureDatetime")
    var firstDepartureDatetime:LocalDateTime? = null
    @QueryParameter("lastDepartureDatetime")
    var lastDepartureDatetime:LocalDateTime? = null
    @QueryParameter("maxTransferDuration")
    var maxTransferDuration:String? = null
    @QueryParameter("maxTransferNumber")
    var maxTransferNumber:String? = null
    @QueryParameter("roadMode")
    var roadMode:String? = null
    @QueryParameter("roadSpeed")
    var roadSpeed:Float? = null
    @QueryParameter("roadMaxDistance")
    var roadMaxDistance:String? = null
    @QueryParameter("startRoadMode")
    var startRoadMode:String? = null
    @QueryParameter("startRoadSpeed")
    var startRoadSpeed:Float? = null
    @QueryParameter("startRoadMaxDistance")
    var startRoadMaxDistance:String? = null
    @QueryParameter("rollingStockList")
    var rollingStockList:String? = null
    @QueryParameter("number")
    var number:Int? = null
    @QueryParameter("displayResultTable")
    var displayResultTable:Boolean? = null
    @QueryParameter("displayWording")
    var displayWording:Boolean? = null
    @QueryParameter("displayMessages")
    var displayMessages:Boolean? = null
    @QueryParameter("maxApproachDistance")
    var maxApproachDistance:String? = null
}
