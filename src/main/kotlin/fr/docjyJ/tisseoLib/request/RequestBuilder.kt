package fr.docjyJ.tisseoLib.request

import com.google.gson.GsonBuilder
import fr.docjyJ.apiClientBuilder.connection.RequestGetBuilder
import fr.docjyJ.apiClientBuilder.exception.ClientException
import fr.docjyJ.tisseoLib.typeAdapter.*
import java.awt.Color
import java.net.HttpURLConnection
import java.time.Duration
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter


internal class RequestBuilder( private val apiKey: String, private val serviceName: String) : RequestGetBuilder() {

    override fun getUrl():String = "https://api.tisseo.fr/v1/$serviceName.json?${parameters}key=$apiKey"

    override fun HttpURLConnection.connectionApply(): HttpURLConnection = this

    override fun GsonBuilder.customGson(): GsonBuilder = apply {
        registerTypeAdapter(Boolean::class.java, BooleanTypeAdapter())
        registerTypeAdapter(LocalDateTime::class.java, LocalDateTimeTypeAdapter())
        registerTypeAdapter(LocalTime::class.java, LocalTimeTypeAdapter())
        registerTypeAdapter(Duration::class.java, DurationTypeAdapter())
        registerTypeAdapter(Color::class.java, ColorTypeAdapter())
    }


    @Throws(ClientException::class)
    fun addParameter(key: String, value: Boolean?){
        if(value != null) {
            //Super
            addParameter(key, if(value == true) "1" else "0")
        }
    }
    @Throws(ClientException::class)
    fun addParameter(key: String, value: Int?){
        if(value != null) {
            //Super
            addParameter(key, value.toString())
        }
    }
    @Throws(ClientException::class)
    fun addParameter(key: String, value: Float?){
        if(value != null) {
            //Super
            addParameter(key, value.toString())
        }
    }
    @Throws(ClientException::class)
    fun addParameter(key: String, value: LocalDateTime?) {
        if(value != null){
            //vars
            val dateStr:String

            //Encode date
            try {
                dateStr = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format(value)
            }

            // block exception
            catch (e: Throwable){
                throw ClientException( ClientException.ENCODE_DATE, e)
            }

            //Super
            addParameter(key, dateStr)
        }
    }

}
