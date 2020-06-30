package fr.docjyJ.tisseoLib.utils

import com.google.gson.GsonBuilder
import java.io.FileWriter
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL

/**
 * Signals that an error was reached during the request to the server.
 *
 * @property tisseoError An object that contains information about the server error.
 */
class TisseoException internal constructor(connection: HttpURLConnection) : Exception(GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create().toJson(TisseoError(connection.url, connection.responseCode, connection.responseMessage)))
{

    val tisseoError = TisseoError(connection.url, connection.responseCode, connection.responseMessage)


    /**
     * Object that contains information about the server error.
     *
     * @property url The URL used.
     * @property responseCode The response code.
     * @property responseMessage The response message.
     */
    data class TisseoError internal constructor(
            val url: URL,
            val responseCode: Int,
            val responseMessage: String
    )
}
