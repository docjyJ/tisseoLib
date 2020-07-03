package fr.docjyJ.tisseoLib.util

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonParseException
import java.lang.reflect.Type
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException


internal class LocalDateTimeTypeAdapter : JsonDeserializer<LocalDateTime> {
    @Throws(JsonParseException::class)
    override fun deserialize(
            json: JsonElement, typeOfT: Type?,
            context: JsonDeserializationContext?
    ): LocalDateTime {
        val code = json.asString
        return try {
            LocalDateTime.parse(code, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))
        } catch (e: DateTimeParseException){
            LocalDateTime.parse(code, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
        }
    }
}
