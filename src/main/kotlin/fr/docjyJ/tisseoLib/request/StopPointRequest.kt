package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.annotation.QueryName
import fr.docjyJ.tisseoLib.response.StopPointResponse

/**
 * The class builder to do a Stop Point request.
 *
 * @constructor Create new request builder with no parameters.
 *
 * @param apiKey REQUIRED The Tisseo Api Key.
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
        @QueryName("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<StopPointResponse>(
        "stop_points",
        StopPointResponse::class.java
) {
    @QueryName("network")
    var network:String? = null
    @QueryName("srid")
    var srid:String? = null
    @QueryName("bbox")
    var bbox:String? = null
    @QueryName("number")
    var number:Int? = null
    @QueryName("sortByDistance")
    var sortByDistance:Boolean? = null
    @QueryName("displayDestinations")
    var displayDestinations:Boolean? = null
    @QueryName("displayLines")
    var displayLines:Boolean? = null
    @QueryName("displayCoordXY")
    var displayCoordXY:Boolean? = null
    @QueryName("lineId")
    var lineId:String? = null
    @QueryName("stopAreaId")
    var stopAreaId:String? = null
    @QueryName("timeframe")
    var timeframe:String? = null
    @QueryName("displayStopsWithoutDeparture")
    var displayStopsWithoutDeparture:Boolean? = null
}
