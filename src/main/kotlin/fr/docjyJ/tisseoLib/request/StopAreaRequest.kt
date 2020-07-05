package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.anotation.EndpointURL
import fr.docjyJ.apiClientBuilder.anotation.QueryParameter
import fr.docjyJ.tisseoLib.response.StopAreaResponse

/**
 * The class builder to do a Stop Area request.
 *
 * @constructor Create new request builder with no parameters.
 *
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
        @QueryParameter("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<StopAreaResponse>(StopAreaResponse::class.java) {
    @EndpointURL
    private val endpointURL = "https://api.tisseo.fr/v1/stop_areas.json"

    @QueryParameter("network")
    var network:String? = null
    @QueryParameter("srid")
    var srid:String? = null
    @QueryParameter("bbox")
    var bbox:String? = null
    @QueryParameter("displayLines")
    var displayLines:Boolean? = null
    @QueryParameter("displayCoordXY")
    var displayCoordXY:Boolean? = null
    @QueryParameter("lineId")
    var lineId:String? = null
    @QueryParameter("terminusId")
    var terminusId:String? = null
    @QueryParameter("timeframe")
    var timeframe:String? = null
    @QueryParameter("ignoreUnservedStops")
    var ignoreUnservedStops:String? = null
    @QueryParameter("displayArrivalOnlyLines")
    var displayArrivalOnlyLines:Boolean? = null
    @QueryParameter("displayStopPoints")
    var displayStopPoints:Boolean? = null
}
