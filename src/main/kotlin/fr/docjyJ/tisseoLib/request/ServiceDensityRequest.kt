@file:Suppress("MemberVisibilityCanBePrivate")

package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.connection.RequestTemplate
import fr.docjyJ.apiClientBuilder.exception.ClientException
import fr.docjyJ.apiClientBuilder.exception.ServerException
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

class ServiceDensityRequest(private val apiKey: String) : RequestTemplate {
    var centerXY:String? = null
    var srid:String? = null
    var serviceNumber:Int? = null
    var beginDateTimeSlot:LocalDateTime? = null
    var endDateTimeSlot:LocalDateTime? = null
    var networkList:String? = null
    var rollingStockList:String? = null
    var displayServices:Boolean? = null

    private fun buildParams() = RequestBuilder(
        apiKey,
        "services_density"
    ).apply {
        addParameter("centerXY",centerXY)
        addParameter("srid",srid)
        addParameter("serviceNumber",serviceNumber)
        addParameter("beginDateTimeSlot",beginDateTimeSlot)
        addParameter("endDateTimeSlot",endDateTimeSlot)
        addParameter("networkList",networkList)
        addParameter("rollingStockList",rollingStockList)
        addParameter("displayServices",displayServices)
    }

    /**
     * Execute the request.
     * @return Response of request in ServiceDensityResponse object.
     * @throws ServerException When the server returns an error.
     * @throws ClientException When the library makes a mistake.
     */
    @Throws(ServerException::class, ClientException::class)
    override fun execute() = buildParams().execute(ServiceDensityResponse::class.java)

    /**
     * Execute the request.
     * @return Response of request in String object.
     * @throws ServerException When the server returns an error.
     * @throws ClientException When the library makes a mistake.
     */
    @Throws(ServerException::class, ClientException::class)
    override fun executeAsString() = buildParams().execute()

    /**
     * Show the URL.
     * @return The URL of request in String object.
     * @throws ClientException When the library makes a mistake.
     */
    @Throws(ClientException::class)
    override fun getUrl() = buildParams().getUrl()

}
