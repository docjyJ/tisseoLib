package fr.docjyJ.tisseoLib.request

import com.google.gson.GsonBuilder
import com.google.gson.JsonSyntaxException
import fr.docjyJ.tisseoLib.exception.TisseoClientException
import fr.docjyJ.tisseoLib.exception.TisseoServerException
import fr.docjyJ.tisseoLib.typeAdapter.*
import org.locationtech.jts.geom.Geometry
import java.awt.Color
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.UnsupportedEncodingException
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

    internal fun getUrl():String = "https://api.tisseo.fr/v1/$serviceName.json?${stringBuilder}key=$apiKey"

    @Throws(TisseoServerException::class, TisseoClientException::class)
    internal fun execute():String {
        try {
        val connection: HttpURLConnection = URL(getUrl()).openConnection() as HttpURLConnection
        val responseCode: Int = connection.responseCode
            if (responseCode == HttpURLConnection.HTTP_OK)
                try {
                    return StringBuffer().apply {
                        BufferedReader(InputStreamReader(connection.inputStream)).readLines().forEach {
                            append(it)
                        }
                    }.toString()
                } catch (e: IOException){
                    throw TisseoClientException(
                        TisseoClientException.READ_RESPONSE,
                        e
                    )
                }
            else
                throw TisseoServerException(connection)
        } catch (e: IOException){
            throw TisseoClientException(
                TisseoClientException.CREATE_REQUEST,
                e
            )
        }

    }

    @Throws(TisseoServerException::class, TisseoClientException::class)
    internal fun <T> execute(classOfT: Class<T>):T {
        try {
            return GsonBuilder()
                .registerTypeAdapter(Boolean::class.java, BooleanTypeAdapter())
                .registerTypeAdapter(LocalDateTime::class.java, LocalDateTimeTypeAdapter())
                .registerTypeAdapter(LocalTime::class.java, LocalTimeTypeAdapter())
                .registerTypeAdapter(Duration::class.java, DurationTypeAdapter())
                .registerTypeAdapter(Color::class.java, ColorTypeAdapter())
                .registerTypeAdapter(Geometry::class.java, GeometryTypeAdapter())
                .create()
                .fromJson(execute(), classOfT)
        } catch (e : JsonSyntaxException){
            throw TisseoClientException(
                TisseoClientException.PARSE_OBJECT,
                e
            )
        }

    }

    @Throws(TisseoClientException::class)
    internal fun addParameter(key: String, value: String?){
        try {
            if(value != null)
                stringBuilder.append("$key=${URLEncoder.encode(value, StandardCharsets.UTF_8.toString())}&")
        } catch (e: UnsupportedEncodingException){
            throw TisseoClientException(
                TisseoClientException.ENCODE_PARAMETER,
                e
            )
        }
    }
    @Throws(TisseoClientException::class)
    internal fun addParameter(key: String, value: Boolean?){
        if(value != null)
            addParameter(key, if(value == true) "1" else "0")
    }
    @Throws(TisseoClientException::class)
    internal fun addParameter(key: String, value: Int?){
        if(value != null)
            addParameter(key, value.toString())
    }
    @Throws(TisseoClientException::class)
    internal fun addParameter(key: String, value: Float?){
        if(value != null)
            addParameter(key, value.toString())
    }
    @Throws(TisseoClientException::class)
    internal fun addParameter(key: String, value: LocalDateTime?) {
        if(value != null)
            addParameter(key, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format(value))
    }

}
