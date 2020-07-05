package fr.docjyJ.tisseoLib.request

import fr.docjyJ.apiClientBuilder.anotation.EndpointURL
import fr.docjyJ.apiClientBuilder.anotation.QueryParameter
import fr.docjyJ.tisseoLib.response.NetworksResponse

/**
 * The class builder to do a Network request.
 *
 * @constructor Create new request builder with no parameters.
 */

class NetworksRequest(
        @QueryParameter("key")
        private val apiKey: String
) : TisseoRequestGetBuilder<NetworksResponse>(NetworksResponse::class.java) {
    @EndpointURL
    private val endpointURL = "https://api.tisseo.fr/v1/networks.json"
}
