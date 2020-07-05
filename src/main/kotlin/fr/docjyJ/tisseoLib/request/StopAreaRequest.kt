package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.annotation.QueryName
import fr.docjyJ.tisseoLib.response.StopAreaResponse

/**
 * The class builder to do a Stop Area request.
 *
 * @constructor Create new request builder with no parameters.
 *
 * @param apiKey REQUIRED The Tisseo Api Key.
 * @property network Transport operator.
 * @property srid Spatial reference number projection. [see](https://en.wikipedia.org/wiki/SRID)
 * @property bbox Filters stops included in bounding box.
 * @property displayLines Adds lines of each stop.
 * @property displayCoordXY Adds centroid coordinate lines of each stop.
 * @property lineId Filters stops by line.
 * @property terminusId Filters on stop areas arriving and departing from this terminal only.
 * @property timeframe Number of days to calculate which lines pass through a given point.
 * @property ignoreUnservedStops Ignore unserved stop in the given timeframe.
 * @property displayArrivalOnlyLines Filters only lines which arrive to stops. (and which do not start from)
 * @property displayStopPoints Display stop point of stop areas.
 */

class StopAreaRequest(
        @QueryName("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<StopAreaResponse>(
        "stop_areas",
        StopAreaResponse::class.java
) {
    @QueryName("network")
    var network:String? = null
    @QueryName("srid")
    var srid:String? = null
    @QueryName("bbox")
    var bbox:String? = null
    @QueryName("displayLines")
    var displayLines:Boolean? = null
    @QueryName("displayCoordXY")
    var displayCoordXY:Boolean? = null
    @QueryName("lineId")
    var lineId:String? = null
    @QueryName("terminusId")
    var terminusId:String? = null
    @QueryName("timeframe")
    var timeframe:String? = null
    @QueryName("ignoreUnservedStops")
    var ignoreUnservedStops:String? = null
    @QueryName("displayArrivalOnlyLines")
    var displayArrivalOnlyLines:Boolean? = null
    @QueryName("displayStopPoints")
    var displayStopPoints:Boolean? = null
}
