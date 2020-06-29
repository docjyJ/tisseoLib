package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.model.StopAreaResponse
import fr.docjyJ.tisseoLib.utils.RequestBuilder
import fr.docjyJ.tisseoLib.utils.TisseoException

/**
 * The class builder to do a Stop Area request.
 *
 * @property network The network propriety.
 * @property srid The srid propriety.
 * @property bbox The bbox propriety.
 * @property displayLines The displayLines propriety.
 * @property displayCoordXY The displayCoordXY propriety.
 * @property lineId The lineId propriety.
 * @property timeframe The timeframe propriety.
 * @property ignoreUnservedStops The ignoreUnservedStops propriety.
 * @property displayArrivalOnlyLines The displayArrivalOnlyLines propriety.
 * @property displayStopPoints The displayStopPoints propriety.
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

    /**
     * Execute the request.
     * @return Response of request in StopAreaResponse object.
     * @throws  TisseoException
     */
    @Throws(TisseoException::class)
    fun execute() = RequestBuilder()
        .apply {
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
        .execute(apiKey,"stop_areas", StopAreaResponse::class.java)

}
