package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.anotation.QueryParameter
import fr.docjyJ.tisseoLib.response.PlacesResponse

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
 * @property displayOnlyAddresses Returns only object of className “address”.
 * @property displayOnlyPublicPlaces Returns only object of className “public_places”.
 * @property displayOnlyCities Returns only object of className “city”.
 * @property lang Choice of language.
 * @property simple Formatting the json output for jquery.
 * @property publicPlaceFilter List of public places to explose.
 */

class PlacesRequest(
        @QueryParameter("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<PlacesResponse>(
        "places",
        PlacesResponse::class.java
) {
    @QueryParameter("term")
    var term:String? = null
    @QueryParameter("network")
    var network:String? = null
    @QueryParameter("coordinatesXY")
    var coordinatesXY:String? = null
    @QueryParameter("maxDistance")
    var maxDistance:Boolean? = null
    @QueryParameter("srid")
    var srid:String? = null
    @QueryParameter("bbox")
    var bbox:String? = null
    @QueryParameter("number")
    var number:Int? = null
    @QueryParameter("displayBestPlace")
    var displayBestPlace:Boolean? = null
    @QueryParameter("displayOnlyStopAreas")
    var displayOnlyStopAreas:Boolean? = null
    @QueryParameter("displayOnlyRoads")
    var displayOnlyRoads:Boolean? = null
    @QueryParameter("displayOnlyAddresses")
    var displayOnlyAddresses:Boolean? = null
    @QueryParameter("displayOnlyPublicPlaces")
    var displayOnlyPublicPlaces:Boolean? = null
    @QueryParameter("displayOnlyCities")
    var displayOnlyCities:Boolean? = null
    @QueryParameter("lang")
    var lang:String? = null
    @QueryParameter("simple")
    var simple:Boolean? = null
    @QueryParameter("publicPlaceFilter")
    var publicPlaceFilter:String? = null
}
