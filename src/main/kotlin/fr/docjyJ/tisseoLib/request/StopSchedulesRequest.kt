package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.model.StopAreaResponse
import fr.docjyJ.tisseoLib.model.StopSchedulesResponse
import fr.docjyJ.tisseoLib.utils.RequestBuilder
import fr.docjyJ.tisseoLib.utils.TisseoException
import java.util.*

/**
 * The class builder to do a Stop Schedules request.
 *
 * @property operatorCode The operatorCode propriety.
 * @property stopPointId The stopPointId propriety.
 * @property stopAreaId The stopAreaId propriety.
 * @property stopsList The stopsList propriety.
 * @property network The network propriety.
 * @property number The number propriety.
 * @property lineId The lineId propriety.
 * @property displayRealTime The displayRealTime propriety.
 * @property timetableByArea The timetableByArea propriety.
 * @property datetime The datetime propriety.
 * @property maxDays The maxDays propriety.
 * @property firstAndLastOfDay The firstAndLastOfDay propriety.
 */

@Suppress("MemberVisibilityCanBePrivate")
class StopSchedulesRequest(private val apiKey: String){
    var operatorCode:String? = null
    var stopPointId:String? = null
    var stopAreaId:String? = null
    var stopsList:String? = null
    var network:String? = null
    var number:String? = null
    var lineId:String? = null
    var displayRealTime:Boolean? = null
    var timetableByArea:Boolean? = null
    var datetime:Date? = null
    var maxDays:Int? = null
    var firstAndLastOfDay:Boolean? = null

    /**
     * Execute the request.
     * @return Response of request in StopSchedulesResponse object.
     * @throws  TisseoException
     */
    @Throws(TisseoException::class)
    fun execute() = RequestBuilder()
        .apply {
            addParameter("operatorCode",operatorCode)
            addParameter("stopPointId",stopPointId)
            addParameter("stopAreaId",stopAreaId)
            addParameter("stopsList",stopsList)
            addParameter("network",network)
            addParameter("number",number)
            addParameter("lineId",lineId)
            addParameter("displayRealTime",displayRealTime)
            addParameter("timetableByArea",timetableByArea)
            addParameter("datetime",datetime)
            addParameter("maxDays",maxDays)
            addParameter("firstAndLastOfDay",firstAndLastOfDay)
        }
        .execute(apiKey,"stops_schedules", StopSchedulesResponse::class.java)

}
