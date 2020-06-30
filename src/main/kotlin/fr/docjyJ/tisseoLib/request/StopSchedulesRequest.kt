package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.model.stopSchedule.StopSchedulesResponse
import fr.docjyJ.tisseoLib.utils.RequestBuilder
import fr.docjyJ.tisseoLib.utils.TisseoException
import java.time.LocalDateTime

/**
 * The class builder to do a Stop Schedules request.
 *
 * @constructor Create new request builder with no parameters.
 *
 * @property operatorCode Operator code (id used by transport operator)
 * @property stopPointId Is the number of physical stop point
 * @property stopAreaId Is the number of logical stop point (zone)
 * @property stopsList A list of stop areas or stop points (or both) separated by commas. Allows you to filter them in each argument by business line or direction.
 * @property network Transport operator
 * @property number Max returned results number
 * @property lineId Filters schedules of a specific line
 * @property displayRealTime Allows specify « theoritical » or « real time » passages time
 * @property timetableByArea Groups the results by stop areas then couples (line, destination) ordered by time of next departure
 * @property datetime Date and time at which we request the schedules
 * @property maxDays number of days used to get “number” departures
 * @property firstAndLastOfDay Will return only first and last departure of the day
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
    var datetime:LocalDateTime? = null
    var maxDays:Int? = null
    var firstAndLastOfDay:Boolean? = null

    private fun buildParams() = RequestBuilder(apiKey, "stops_schedules").apply {
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

    /**
     * Execute the request.
     * @return Response of request in StopSchedulesResponse object.
     * @throws  TisseoException
     */
    @Throws(TisseoException::class)
    fun execute() = buildParams().execute(StopSchedulesResponse::class.java)

    /**
     * Execute the request.
     * @return Response of request in String object.
     * @throws  TisseoException
     */
    @Throws(TisseoException::class)
    fun executeAsString() = buildParams().execute()

}
