package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.model.netwotk.NetworksResponse
import fr.docjyJ.tisseoLib.util.RequestBuilder
import fr.docjyJ.tisseoLib.util.TisseoException

/**
 * The class builder to do a Network request.
 *
 * @constructor Create new request builder with no parameters.
 */

@Suppress("MemberVisibilityCanBePrivate")
class NetworksRequest(private val apiKey: String){
    private fun buildParams() = RequestBuilder(apiKey,"networks")

    /**
     * Execute the request.
     * @return Response of request in NetworksResponse object.
     * @throws  TisseoException
     */
    @Throws(TisseoException::class)
    fun execute() = buildParams().execute(NetworksResponse::class.java)

    /**
     * Execute the request.
     * @return Response of request in String object.
     * @throws  TisseoException
     */
    @Throws(TisseoException::class)
    fun executeAsString() = buildParams().execute()

}
