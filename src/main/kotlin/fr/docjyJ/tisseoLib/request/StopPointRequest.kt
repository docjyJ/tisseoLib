package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.model.stopPoint.StopPointResponse
import fr.docjyJ.tisseoLib.utils.RequestBuilder
import fr.docjyJ.tisseoLib.utils.TisseoException

/**
 * The class builder to do a Stop Point request.
 *
 * @property network the network propriety.
 * @property srid the content srid propriety.
 * @property bbox the content bbox propriety.
 * @property number the content number propriety.
 * @property sortByDistance the sort by distance propriety.
 * @property displayDestinations the display destinations propriety.
 * @property displayLines the content display lines propriety.
 * @property displayCoordXY the content display coord xy propriety.
 * @property lineId the content line id propriety.
 * @property stopAreaId the stop area id propriety.
 * @property timeframe the time frame stops propriety.
 * @property displayStopsWithoutDeparture the display stops without departure propriety.
 */

@Suppress("MemberVisibilityCanBePrivate")
class StopPointRequest internal constructor(private val apiKey: String){
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
     * @return Response of request in StopPointResponce object.
     * @throws  TisseoException
     */
    @Throws(TisseoException::class)
    fun execute() = buildParams().execute(StopPointResponse::class.java)

    /**
     * Execute the request.
     * @return Response of request in String object.
     * @throws  TisseoException
     */
    @Throws(TisseoException::class)
    fun executeAsString() = buildParams().execute()

}
