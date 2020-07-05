package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.anotation.QueryParameter
import fr.docjyJ.tisseoLib.response.StopPointResponse

/**
 * The class builder to do a Stop Point request.
 *
 * @constructor Create new request builder with no parameters.
 *
 * @property network Transport operator.
 * @property srid Spatial reference number projection. [see](https://en.wikipedia.org/wiki/SRID)
 * @property bbox Filters stops included in bounding box.
 * @property number Limit number of results to return.
 * @property sortByDistance Sorting results by distance from the center of the bounding box.
 * @property displayDestinations Adds line destinations.
 * @property displayLines Adds lines serving each stop point.
 * @property displayCoordXY Adds coordinates details of each stop. (stop and logical stopping post)
 * @property lineId Filters stops by ID line.
 * @property stopAreaId Filters only on the id stop zone.
 * @property timeframe Number of days covering research, the day time interval is a single day by default.
 * @property displayStopsWithoutDeparture Filters only stops for which there is no departure (and lines / if destinations is requested). For example, without this setting no line is returned.
 */

class StopPointRequest(
        @QueryParameter("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<StopPointResponse>(
        "stop_points",
        StopPointResponse::class.java
) {
    @QueryParameter("network")
    var network:String? = null
    @QueryParameter("srid")
    var srid:String? = null
    @QueryParameter("bbox")
    var bbox:String? = null
    @QueryParameter("number")
    var number:Int? = null
    @QueryParameter("sortByDistance")
    var sortByDistance:Boolean? = null
    @QueryParameter("displayDestinations")
    var displayDestinations:Boolean? = null
    @QueryParameter("displayLines")
    var displayLines:Boolean? = null
    @QueryParameter("displayCoordXY")
    var displayCoordXY:Boolean? = null
    @QueryParameter("lineId")
    var lineId:String? = null
    @QueryParameter("stopAreaId")
    var stopAreaId:String? = null
    @QueryParameter("timeframe")
    var timeframe:String? = null
    @QueryParameter("displayStopsWithoutDeparture")
    var displayStopsWithoutDeparture:Boolean? = null
}
