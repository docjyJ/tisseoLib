package fr.docjyJ.tisseoLib.request

import com.google.gson.GsonBuilder
import fr.docjyJ.tisseoLib.utils.BooleanTypeAdapter
import fr.docjyJ.tisseoLib.utils.TisseoException
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

abstract class Request protected constructor(private val apiKey: String, private val serviceName: String) {
    private val GSON = GsonBuilder().registerTypeAdapter(Boolean::class.java, BooleanTypeAdapter()).create()

    private val stringBuilder = StringBuilder()

    @Throws(TisseoException::class)
    protected fun <T> getRequest(classOfT: Class<T>):T {
        val connection: HttpURLConnection = URL("https://api.tisseo.fr/v1/$serviceName.json?${stringBuilder}key=$apiKey").openConnection() as HttpURLConnection
        val responseCode: Int = connection.responseCode
        if (responseCode == HttpURLConnection.HTTP_OK)
            return GSON.fromJson(InputStreamReader(connection.inputStream), classOfT)
        else
            throw TisseoException(connection)
    }
    protected fun addParameter(key:String,value:String?){
        stringBuilder.append(if(value == null) "" else "$key=${URLEncoder.encode(value, StandardCharsets.UTF_8.toString())}&")
    }
    protected fun addParameter(key:String,value:Boolean?){
        addParameter(key,if(value == true) {"1"} else {if (value == false) {"0"} else {null}})
    }
    protected fun addParameter(key:String,value:Int?){
        addParameter(key,value?.toString())
    }
}
