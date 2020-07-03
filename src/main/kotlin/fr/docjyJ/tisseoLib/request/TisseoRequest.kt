package fr.docjyJ.tisseoLib.request

import fr.docjyJ.tisseoLib.exception.TisseoClientException
import fr.docjyJ.tisseoLib.exception.TisseoServerException
import fr.docjyJ.tisseoLib.response.TisseoResponse

/**
 * Interface of the class builder to do a request.
 */

interface TisseoRequest{
    /**
     * Execute the request.
     * @return Response of request in TisseoResponse object.
     * @throws TisseoServerException When the server returns an error.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoServerException::class, TisseoClientException::class)
    fun execute():TisseoResponse

    /**
     * Execute the request.
     * @return Response of request in String object.
     * @throws TisseoServerException When the server returns an error.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoServerException::class, TisseoClientException::class)
    fun executeAsString():String

    /**
     * Show the URL.
     * @return The URL of request in String object.
     * @throws TisseoClientException When the library makes a mistake.
     */
    @Throws(TisseoClientException::class)
    fun getUrl():String
}
