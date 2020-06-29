package fr.docjyJ.tisseoLib.utils

import com.google.gson.GsonBuilder
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import java.nio.charset.StandardCharsets
import java.text.SimpleDateFormat
import java.util.*


internal class RequestBuilder() {
    private val GSON = GsonBuilder().registerTypeAdapter(Boolean::class.java,
        BooleanTypeAdapter()
    ).create()

    private val stringBuilder = StringBuilder()

    @Throws(TisseoException::class)
    internal fun <T> execute(apiKey: String, serviceName: String, classOfT: Class<T>):T {
        val connection: HttpURLConnection = URL("https://api.tisseo.fr/v1/$serviceName.json?${stringBuilder}key=$apiKey").openConnection() as HttpURLConnection
        val responseCode: Int = connection.responseCode
        if (responseCode == HttpURLConnection.HTTP_OK)
            return GSON.fromJson(InputStreamReader(connection.inputStream), classOfT)
        else
            throw TisseoException(connection)
    }
    internal fun addParameter(key: String, value: String?){
        if(value != null)
            stringBuilder.append("$key=${URLEncoder.encode(value, StandardCharsets.UTF_8.toString())}&")
    }
    internal fun addParameter(key: String, value: Boolean?){
        if(value != null)
            addParameter(key, if(value == true) "1" else "0")
    }
    internal fun addParameter(key: String, value: Int?){
        if(value != null)
            addParameter(key, value.toString())
    }
    internal fun addParameter(key: String, value: Date?) {
        if(value != null)
            addParameter(key, SimpleDateFormat("yyyy-MM-dd HH:mm").format(value))
    }

    @Throws(TisseoException::class)
    internal fun execute(apiKey: String, serviceName: String):String {
        val connection: HttpURLConnection = URL("https://api.tisseo.fr/v1/$serviceName.json?${stringBuilder}key=$apiKey").openConnection() as HttpURLConnection
        val responseCode: Int = connection.responseCode
        if (responseCode == HttpURLConnection.HTTP_OK)
            return StringBuffer().apply {
                BufferedReader(InputStreamReader(connection.inputStream)).readLines().forEach {
                    append(it)
                }
            }.toString()
        else
            throw TisseoException(connection)
    }


}
