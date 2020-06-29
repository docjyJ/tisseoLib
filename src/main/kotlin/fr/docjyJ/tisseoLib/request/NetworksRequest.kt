package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.model.NetworksResponse
import fr.docjyJ.tisseoLib.utils.RequestBuilder
import fr.docjyJ.tisseoLib.utils.TisseoException

/**
 * The class builder to do a Network request.
 */

@Suppress("MemberVisibilityCanBePrivate")
class NetworksRequest(private val apiKey: String){
    /**
     * Execute the request.
     * @return Response of request in NetworksResponse object.
     * @throws  TisseoException
     */
    @Throws(TisseoException::class)
    fun execute() = RequestBuilder()
        .execute(apiKey,"networks",NetworksResponse::class.java)
}
