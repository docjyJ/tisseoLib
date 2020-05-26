package fr.docjyJ.tisseoLib.utils

import com.google.gson.GsonBuilder
import java.io.FileWriter
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL

class TisseoException(connection: HttpURLConnection) : Exception(GsonBuilder().setPrettyPrinting().create().toJson(TisseoError(connection.url, connection.responseCode, connection.responseMessage)))
{
    val tisseoError = TisseoError(connection.url, connection.responseCode, connection.responseMessage)
    data class TisseoError(
            val url: URL,
            val responseCode: Int,
            val responseMessage: String
    )
}
