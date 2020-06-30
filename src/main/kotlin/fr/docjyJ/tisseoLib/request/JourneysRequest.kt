package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.model.journey.JourneysResponse
import fr.docjyJ.tisseoLib.utils.RequestBuilder
import fr.docjyJ.tisseoLib.utils.TisseoException
import java.util.*

/**
 * The class builder to do a Journeys request.
 *
 * @property departurePlace The departurePlace propriety.
 * @property departurePlaceXY The departurePlaceXY propriety.
 * @property arrivalPlace The arrivalPlace propriety.
 * @property arrivalPlaceXY The arrivalPlaceXY propriety.
 * @property srid The srid propriety.
 * @property networkList The networkList propriety.
 * @property firstDepartureDatetime The firstDepartureDatetime propriety.
 * @property lastDepartureDatetime The lastDepartureDatetime propriety.
 * @property maxTransferDuration The maxTransferDuration propriety.
 * @property maxTransferNumber The maxTransferNumber propriety.
 * @property roadMode The roadMode propriety.
 * @property roadSpeed The roadSpeed propriety.
 * @property roadMaxDistance The roadMaxDistance propriety.
 * @property startRoadMode The startRoadMode propriety.
 * @property startRoadMaxDistance The startRoadMaxDistance propriety.
 * @property rollingStockList The rollingStockList propriety.
 * @property number The number propriety.
 * @property displayResultTable The displayResultTable propriety.
 * @property displayWording The displayWording propriety.
 * @property displayMessages The displayMessages propriety.
 * @property maxApproachDistance The maxApproachDistance propriety.
 */

@Suppress("MemberVisibilityCanBePrivate")
class JourneysRequest(private val apiKey: String){
    var departurePlace:String? = null
    var departurePlaceXY:String? = null
    var arrivalPlace:String? = null
    var arrivalPlaceXY:String? = null
    var srid:String? = null
    var networkList:String? = null
    var firstDepartureDatetime:Date? = null
    var lastDepartureDatetime:Date? = null
    var maxTransferDuration:String? = null
    var maxTransferNumber:String? = null
    var roadMode:String? = null
    var roadSpeed:String? = null
    var roadMaxDistance:String? = null
    var startRoadMode:String? = null
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
     * @throws  TisseoException
     */
    @Throws(TisseoException::class)
    fun execute() = buildParams().execute(JourneysResponse::class.java)

    /**
     * Execute the request.
     * @return Response of request in String object.
     * @throws  TisseoException
     */
    @Throws(TisseoException::class)
    fun executeAsString() = buildParams().execute()
}
