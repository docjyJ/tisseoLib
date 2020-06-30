package fr.docjyJ.tisseoLib.utils

import com.google.gson.GsonBuilder
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import java.nio.charset.StandardCharsets
import java.text.SimpleDateFormat
import java.time.Duration
import java.util.*


internal class RequestBuilder( private val apiKey: String, private val serviceName: String) {
    private val stringBuilder = StringBuilder()

    @Throws(TisseoException::class)
    internal fun execute():String {
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
    @Throws(TisseoException::class)
    internal fun <T> execute(classOfT: Class<T>):T {
        return GsonBuilder()
                .registerTypeAdapter(Boolean::class.java,BooleanTypeAdapter())
                .registerTypeAdapter(Date::class.java,DateTypeAdapter())
                .registerTypeAdapter(Duration::class.java,DurationTypeAdapter())
                .create()
                .fromJson(execute(), classOfT)
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

}
