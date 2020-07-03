package fr.docjyJ.tisseoLib.util

import com.google.gson.GsonBuilder
import fr.docjyJ.tisseoLib.typeAdapter.*
import org.locationtech.jts.geom.Geometry
import java.awt.Color
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import java.nio.charset.StandardCharsets
import java.time.Duration
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter


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
            .registerTypeAdapter(Boolean::class.java, BooleanTypeAdapter())
            .registerTypeAdapter(LocalDateTime::class.java, LocalDateTimeTypeAdapter())
            .registerTypeAdapter(LocalTime::class.java, LocalTimeTypeAdapter())
            .registerTypeAdapter(Duration::class.java, DurationTypeAdapter())
            .registerTypeAdapter(Color::class.java, ColorTypeAdapter())
            .registerTypeAdapter(Geometry::class.java, GeometryTypeAdapter())
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
    internal fun addParameter(key: String, value: Float?){
        if(value != null)
            addParameter(key, value.toString())
    }
    internal fun addParameter(key: String, value: LocalDateTime?) {
        if(value != null)
            addParameter(key, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format(value))
    }

}
