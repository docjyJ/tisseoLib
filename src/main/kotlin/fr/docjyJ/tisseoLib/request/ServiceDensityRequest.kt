package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.model.serviceDensity.ServiceDensityResponse
import fr.docjyJ.tisseoLib.model.stopSchedule.StopSchedulesResponse
import fr.docjyJ.tisseoLib.utils.RequestBuilder
import fr.docjyJ.tisseoLib.utils.TisseoException
import java.time.LocalDateTime

/**
 * The class builder to do a Service Density request.
 *
 * @constructor Create new request builder with no parameters.
 *
 * @property centerXY Désigne l’adresse ou le lieu d’arrivée ou de départ.
 * @property srid spatial reference number projection. [see](https://en.wikipedia.org/wiki/SRID)
 * @property serviceNumber Nombre de services pour lequel on veut une estimation du rayon.
 * @property beginDateTimeSlot Désigne la date et l’heure de début de la tranche horaire de calcul.
 * @property endDateTimeSlot Désigne la date et l’heure de fin de la tranche horaire de calcul.
 * @property networkList Opérateurs de transport.
 * @property rollingStockList Liste des modes de transport utilisés.
 * @property displayServices Affiche les services trouvés dans la zone parcourue.
 */

@Suppress("MemberVisibilityCanBePrivate")
class ServiceDensityRequest(private val apiKey: String){
    var centerXY:String? = null
    var srid:String? = null
    var serviceNumber:Int? = null
    var beginDateTimeSlot:LocalDateTime? = null
    var endDateTimeSlot:LocalDateTime? = null
    var networkList:String? = null
    var rollingStockList:String? = null
    var displayServices:Boolean? = null

    private fun buildParams() = RequestBuilder(apiKey, "services_density").apply {
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
     * @throws  TisseoException
     */
    @Throws(TisseoException::class)
    fun execute() = buildParams().execute(ServiceDensityResponse::class.java)

    /**
     * Execute the request.
     * @return Response of request in String object.
     * @throws  TisseoException
     */
    @Throws(TisseoException::class)
    fun executeAsString() = buildParams().execute()

}
