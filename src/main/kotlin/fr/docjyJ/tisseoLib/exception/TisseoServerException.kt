package fr.docjyJ.tisseoLib.exception

import com.google.gson.GsonBuilder
import java.net.HttpURLConnection
import java.net.URL

/**
 * Signals that an error was reached during the request to the server.
 *
 * @property url URL used for the request.
 * @property responseCode code of the request.
 * @property responseMessage message of the request.
 */
class TisseoServerException internal constructor(connection: HttpURLConnection) : Exception(TisseoError(connection).toJson())
{
    val url: URL? = connection.url

    val responseMessage: String? = connection.responseMessage

    val responseCode = connection.responseCode



    private class TisseoError(connection: HttpURLConnection){
        val url = connection.url ?: "no url"

        val responseMessage = connection.responseMessage ?: "no response message"

        val responseCode = connection.responseCode

        fun toJson() = GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create().toJson(this)!!
    }
}
