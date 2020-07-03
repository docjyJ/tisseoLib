package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.exception.TisseoClientException
import fr.docjyJ.tisseoLib.exception.TisseoServerException
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

@Suppress("MemberVisibilityCanBePrivate")
class StopPointRequest internal constructor(private val apiKey: String) : TisseoRequest {
    var network:String? = null
    var srid:String? = null
    var bbox:String? = null
    var number:Int? = null
    var sortByDistance:Boolean? = null
    var displayDestinations:Boolean? = null
    var displayLines:Boolean? = null
    var displayCoordXY:Boolean? = null
    var lineId:String? = null
    var stopAreaId:String? = null
    var timeframe:String? = null
    var displayStopsWithoutDeparture:Boolean? = null

    private fun buildParams() = RequestBuilder(apiKey, "stop_points").apply {
        addParameter("network",network)
        addParameter("srid",srid)
        addParameter("bbox",bbox)
        addParameter("number", number)
        addParameter("sortByDistance",sortByDistance)
        addParameter("displayDestinations",displayDestinations)
        addParameter("displayLines",displayLines)
        addParameter("displayCoordXY",displayCoordXY)
        addParameter("lineId",lineId)
        addParameter("stopAreaId",stopAreaId)
        addParameter("timeframe",timeframe)
        addParameter("displayStopsWithoutDeparture",displayStopsWithoutDeparture)
    }

    /**
     * Execute the request.
     * @return Response of request in StopPointResponse object.
     * @throws TisseoServerException When the server returns an error.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoServerException::class, TisseoClientException::class)
    override fun execute() = buildParams().execute(StopPointResponse::class.java)

    /**
     * Execute the request.
     * @return Response of request in String object.
     * @throws TisseoServerException When the server returns an error.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoServerException::class, TisseoClientException::class)
    override fun executeAsString() = buildParams().execute()

    /**
     * Show the URL.
     * @return The URL of request in String object.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoClientException::class)
    override fun getUrl() = buildParams().getUrl()

}
