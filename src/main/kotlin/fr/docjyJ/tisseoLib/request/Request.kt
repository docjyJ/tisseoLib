package fr.docjyJ.tisseoLib.request

import com.google.gson.GsonBuilder
import fr.docjyJ.tisseoLib.utils.BooleanTypeAdapter
import fr.docjyJ.tisseoLib.utils.TisseoException
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

abstract class Request internal constructor(private val apiKey: String, private val serviceName: String) {
    protected val GSON = GsonBuilder().registerTypeAdapter(Boolean::class.java, BooleanTypeAdapter()).create()

    @Throws(TisseoException::class)
    protected fun getRequest(parameter:String?): InputStreamReader {
        val connection: HttpURLConnection = URL("https://api.tisseo.fr/v1/$serviceName.json?${parameter}key=$apiKey").openConnection() as HttpURLConnection
        val responseCode: Int = connection.responseCode
        if (responseCode == HttpURLConnection.HTTP_OK)
            return InputStreamReader(connection.inputStream)
        else
            throw TisseoException(connection)
    }
    protected fun parameterBuilder(key:String,value:String?):String?{
        return if(value == null) "" else "$key=${URLEncoder.encode(value, StandardCharsets.UTF_8.toString())}&"
    }
    protected fun parameterBuilder(key:String,value:Boolean?):String?{
        return parameterBuilder(key,if(value == true) {"1"} else {if (value == false) {"0"} else {null}})
    }
    protected fun parameterBuilder(key:String,value:Int?):String?{
        return parameterBuilder(key,value?.toString())
    }
}
