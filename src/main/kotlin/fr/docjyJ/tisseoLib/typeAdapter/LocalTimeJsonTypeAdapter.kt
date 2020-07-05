package fr.docjyJ.tisseoLib.typeAdapter

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonParseException
import java.lang.reflect.Type
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException


internal class LocalTimeJsonTypeAdapter : JsonDeserializer<LocalTime> {
    @Throws(JsonParseException::class)
    override fun deserialize(
            json: JsonElement, typeOfT: Type?,
            context: JsonDeserializationContext?
    ): LocalTime? {
        val code = json.asString
        if(code=="") return null
        return try {
            LocalTime.parse(code, DateTimeFormatter.ofPattern("HH:mm"))
        } catch (e: DateTimeParseException){
            LocalTime.parse(code, DateTimeFormatter.ofPattern("HH:mm:ss"))
        }
    }
}
