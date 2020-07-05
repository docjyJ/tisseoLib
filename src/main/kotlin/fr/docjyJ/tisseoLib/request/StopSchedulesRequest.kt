package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.anotation.EndpointURL
import fr.docjyJ.apiClientBuilder.anotation.QueryParameter
import fr.docjyJ.tisseoLib.response.StopSchedulesResponse
import java.time.LocalDateTime

/**
 * The class builder to do a Stop Schedules request.
 *
 * @constructor Create new request builder with no parameters.
 *
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
        @QueryParameter("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<StopSchedulesResponse>(StopSchedulesResponse::class.java) {
    @EndpointURL
    private val endpointURL = "https://api.tisseo.fr/v1/stops_schedules.json"

    @QueryParameter("operatorCode")
    var operatorCode:String? = null
    @QueryParameter("stopPointId")
    var stopPointId:String? = null
    @QueryParameter("stopAreaId")
    var stopAreaId:String? = null
    @QueryParameter("stopsList")
    var stopsList:String? = null
    @QueryParameter("network")
    var network:String? = null
    @QueryParameter("number")
    var number:String? = null
    @QueryParameter("lineId")
    var lineId:String? = null
    @QueryParameter("displayRealTime")
    var displayRealTime:Boolean? = null
    @QueryParameter("timetableByArea")
    var timetableByArea:Boolean? = null
    @QueryParameter("datetime")
    var datetime:LocalDateTime? = null
    @QueryParameter("maxDays")
    var maxDays:Int? = null
    @QueryParameter("firstAndLastOfDay")
    var firstAndLastOfDay:Boolean? = null

}
