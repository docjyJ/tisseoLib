package fr.docjyJ.tisseoLib.request

import com.google.gson.GsonBuilder
import fr.docjyJ.apiClientBuilder.anotation.EndpointURL
import fr.docjyJ.apiClientBuilder.connection.RequestGetBuilder
import fr.docjyJ.apiClientBuilder.connection.ResponseTemplate
import fr.docjyJ.tisseoLib.typeAdapter.*
import java.awt.Color
import java.net.HttpURLConnection
import java.time.Duration
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter

abstract class TisseoRequestGetBuilder<T:ResponseTemplate>(classof:Class<T>):RequestGetBuilder<T>(classof) {

    override fun HttpURLConnection.connectionApply() = this

    override fun GsonBuilder.customGson()=apply {
        registerTypeAdapter(Boolean::class.java, BooleanTypeAdapter())
        registerTypeAdapter(LocalDateTime::class.java, LocalDateTimeTypeAdapter())
        registerTypeAdapter(LocalTime::class.java, LocalTimeTypeAdapter())
        registerTypeAdapter(Duration::class.java, DurationTypeAdapter())
        registerTypeAdapter(Color::class.java, ColorTypeAdapter())
    }

    override fun Any.parameterToString(): String {
        println(this is LocalDateTime)
        return when(this){
            is String -> this
            is Boolean -> if(this) "1" else "0"
            is LocalDateTime -> DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format(this)
            else -> this.toString()
        }
    }

}
