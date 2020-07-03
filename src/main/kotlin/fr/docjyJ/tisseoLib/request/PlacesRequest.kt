package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.exception.TisseoClientException
import fr.docjyJ.tisseoLib.model.place.PlacesResponse
import fr.docjyJ.tisseoLib.exception.TisseoServerException

/**
 * The class builder to do a Line request.
 *
 * Please note that the response object for the Place resource is not implemented.
 * It is possible to get the response string (via the executeAsString () method) and analyze it afterwards.
 *
 * @constructor Create new request builder with no parameters.
 *
 * @property term Text string. (3 characters minimum)
 * @property network Transport operator.
 * @property coordinatesXY Returns nearest adresses from given x,y coordinates sorted by distance.
 * @property maxDistance Max search around distance.
 * @property srid Spatial reference number projection. [see](https://en.wikipedia.org/wiki/SRID)
 * @property bbox Filters stops included in bounding box.
 * @property number Filters the results return max number by type of place.
 * @property displayBestPlace Returns the best result.
 * @property displayOnlyStopAreas Returns only object of className “stop”.
 * @property displayOnlyRoads Returns only object of className “road”.
 * @property displayOnlyAddresses Returns only object of className “adress”.
 * @property displayOnlyPublicPlaces Returns only object of className “public_places”.
 * @property displayOnlyCities Returns only object of className “city”.
 * @property lang Choice of language.
 * @property simple Formatting the json output for jquery.
 * @property publicPlaceFilter List of public places to explose.
 */

@Suppress("MemberVisibilityCanBePrivate")
class PlacesRequest(private val apiKey: String) {
    var term:String? = null
    var network:String? = null
    var coordinatesXY:String? = null
    var maxDistance:Boolean? = null
    var srid:String? = null
    var bbox:String? = null
    var number:Int? = null
    var displayBestPlace:Boolean? = null
    var displayOnlyStopAreas:Boolean? = null
    var displayOnlyRoads:Boolean? = null
    var displayOnlyAddresses:Boolean? = null
    var displayOnlyPublicPlaces:Boolean? = null
    var displayOnlyCities:Boolean? = null
    var lang:String? = null
    var simple:Boolean? = null
    var publicPlaceFilter:String? = null

    private fun buildParams() = RequestBuilder(apiKey, "places").apply {
        addParameter("term",term)
        addParameter("network",network)
        addParameter("coordinatesXY",coordinatesXY)
        addParameter("maxDistance",maxDistance)
        addParameter("srid",srid)
        addParameter("bbox",bbox)
        addParameter("number",number)
        addParameter("displayBestPlace",displayBestPlace)
        addParameter("displayOnlyStopAreas",displayOnlyStopAreas)
        addParameter("displayOnlyRoads",displayOnlyRoads)
        addParameter("displayOnlyAddresses",displayOnlyAddresses)
        addParameter("displayOnlyPublicPlaces",displayOnlyPublicPlaces)
        addParameter("displayOnlyCities",displayOnlyCities)
        addParameter("lang",lang)
        addParameter("simple",simple)
        addParameter("publicPlaceFilter",publicPlaceFilter)
    }

    /**
     * Execute the request.
     * @return Response of request in PlacesResponse object.
     * @throws TisseoServerException When the server returns an error.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoServerException::class, TisseoClientException::class)
    fun execute() = buildParams().execute(PlacesResponse::class.java)

    /**
     * Execute the request.
     * @return Response of request in String object.
     * @throws TisseoServerException When the server returns an error.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoServerException::class, TisseoClientException::class)
    fun executeAsString() = buildParams().execute()

    /**
     * Show the URL.
     * @return The URL of request in String object.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoClientException::class)
    fun getUrl() = buildParams().getUrl()

}
