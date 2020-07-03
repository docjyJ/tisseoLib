package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.exception.TisseoClientException
import fr.docjyJ.tisseoLib.model.stopArea.StopAreaResponse
import fr.docjyJ.tisseoLib.exception.TisseoServerException

/**
 * The class builder to do a Stop Area request.
 *
 * @constructor Create new request builder with no parameters.
 *
 * @property network Transport operator.
 * @property srid Spatial reference number projection. [see](https://en.wikipedia.org/wiki/SRID)
 * @property bbox Filters stops included in bounding box.
 * @property displayLines Adds lines of each stop.
 * @property displayCoordXY Adds centroid coordonate lines of each stop.
 * @property lineId Filters stops by line.
 * @property terminusId Filters on stop areas arriving and departing from this terminal only.
 * @property timeframe Number of days to calculate which lines pass through a given point.
 * @property ignoreUnservedStops Ignore unserved stop in the given timeframe.
 * @property displayArrivalOnlyLines Filters only lines which arrive to stops. (and which do not start from)
 * @property displayStopPoints Display stop point of stop areas.
 */

@Suppress("MemberVisibilityCanBePrivate")
class StopAreaRequest(private val apiKey: String){
    var network:String? = null
    var srid:String? = null
    var bbox:String? = null
    var displayLines:Boolean? = null
    var displayCoordXY:Boolean? = null
    var lineId:String? = null
    var terminusId:String? = null
    var timeframe:String? = null
    var ignoreUnservedStops:String? = null
    var displayArrivalOnlyLines:Boolean? = null
    var displayStopPoints:Boolean? = null

    private fun buildParams() = RequestBuilder(apiKey, "stop_areas").apply {
        addParameter("network",network)
        addParameter("srid",srid)
        addParameter("bbox",bbox)
        addParameter("displayLines",displayLines)
        addParameter("displayCoordXY",displayCoordXY)
        addParameter("lineId",lineId)
        addParameter("terminusId",terminusId)
        addParameter("timeframe",timeframe)
        addParameter("ignoreUnservedStops",ignoreUnservedStops)
        addParameter("displayArrivalOnlyLines",displayArrivalOnlyLines)
        addParameter("displayStopPoints",displayStopPoints)
    }

    /**
     * Execute the request.
     * @return Response of request in StopAreaResponse object.
     * @throws TisseoServerException When the server returns an error.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoServerException::class, TisseoClientException::class)
    fun execute() = buildParams().execute(StopAreaResponse::class.java)

    /**
     * Execute the request.
     * @return Response of request in String object.
     * @throws TisseoServerException When the server returns an error.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoServerException::class, TisseoClientException::class)
    fun executeAsString() = buildParams().execute()

    /**
     * Show the URL.
     * @return The URL of request in String object.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoClientException::class)
    fun getUrl() = buildParams().getUrl()

}
