package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.anotation.QueryParameter
import fr.docjyJ.tisseoLib.response.ServiceDensityResponse
import java.time.LocalDateTime

/**
 * The class builder to do a Service Density request.
 *
 * @constructor Create new request builder with no parameters.
 *
 * @property centerXY Address or place of departure or arrival.
 * @property srid Spatial reference number projection. [see](https://en.wikipedia.org/wiki/SRID)
 * @property serviceNumber Number of distinct transport services we want to reach in the time slot .
 * @property beginDateTimeSlot Beginning date and time of time slot.
 * @property endDateTimeSlot Ending date and time of time slot.
 * @property networkList Transport operators list.
 * @property rollingStockList Transport mode list.
 * @property displayServices Displays the services found in the area covered.
 */

class ServiceDensityRequest(
        @QueryParameter("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<ServiceDensityResponse>(
        "services_density",
        ServiceDensityResponse::class.java
) {
    @QueryParameter("centerXY")
    var centerXY:String? = null
    @QueryParameter("srid")
    var srid:String? = null
    @QueryParameter("serviceNumber")
    var serviceNumber:Int? = null
    @QueryParameter("beginDateTimeSlot")
    var beginDateTimeSlot:LocalDateTime? = null
    @QueryParameter("endDateTimeSlot")
    var endDateTimeSlot:LocalDateTime? = null
    @QueryParameter("networkList")
    var networkList:String? = null
    @QueryParameter("rollingStockList")
    var rollingStockList:String? = null
    @QueryParameter("displayServices")
    var displayServices:Boolean? = null
}
