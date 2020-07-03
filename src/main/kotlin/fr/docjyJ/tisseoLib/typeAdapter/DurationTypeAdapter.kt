package fr.docjyJ.tisseoLib.typeAdapter

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonParseException
import java.lang.reflect.Type
import java.time.Duration
import java.time.LocalTime


internal class DurationTypeAdapter : JsonDeserializer<Duration> {
    @Throws(JsonParseException::class)
    override fun deserialize(
            json: JsonElement, typeOfT: Type?,
            context: JsonDeserializationContext?
    ): Duration? {
        val code = json.asString
        if(code=="") return null
        return Duration.between(LocalTime.MIN, LocalTime.parse(code))
    }
}
