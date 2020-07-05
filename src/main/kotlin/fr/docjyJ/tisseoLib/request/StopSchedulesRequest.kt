package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.annotation.QueryName
import fr.docjyJ.tisseoLib.response.StopSchedulesResponse
import java.time.LocalDateTime

/**
 * The class builder to do a Stop Schedules request.
 *
 * @constructor Create new request builder with no parameters.
 *
 * @param apiKey REQUIRED The Tisseo Api Key.
 * @property operatorCode Operator code. (id used by transport operator)
 * @property stopPointId Is the number of physical stop point.
 * @property stopAreaId Is the number of logical stop point. (zone)
 * @property stopsList A list of stop areas or stop points (or both) separated by commas. Allows you to filter them in each argument by business line or direction.
 * @property network Transport operator.
 * @property number Max returned results number.
 * @property lineId Filters schedules of a specific line.
 * @property displayRealTime Allows specify « theoretical » or « real time » passages time.
 * @property timetableByArea Groups the results by stop areas then couples (line, destination) ordered by time of next departure.
 * @property datetime Date and time at which we request the schedules.
 * @property maxDays Number of days used to get “number” departures.
 * @property firstAndLastOfDay Will return only first and last departure of the day.
 */

class StopSchedulesRequest(
        @QueryName("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<StopSchedulesResponse>(
        "stops_schedules",
        StopSchedulesResponse::class.java
) {
    @QueryName("operatorCode")
    var operatorCode:String? = null
    @QueryName("stopPointId")
    var stopPointId:String? = null
    @QueryName("stopAreaId")
    var stopAreaId:String? = null
    @QueryName("stopsList")
    var stopsList:String? = null
    @QueryName("network")
    var network:String? = null
    @QueryName("number")
    var number:String? = null
    @QueryName("lineId")
    var lineId:String? = null
    @QueryName("displayRealTime")
    var displayRealTime:Boolean? = null
    @QueryName("timetableByArea")
    var timetableByArea:Boolean? = null
    @QueryName("datetime")
    var datetime:LocalDateTime? = null
    @QueryName("maxDays")
    var maxDays:Int? = null
    @QueryName("firstAndLastOfDay")
    var firstAndLastOfDay:Boolean? = null
}
