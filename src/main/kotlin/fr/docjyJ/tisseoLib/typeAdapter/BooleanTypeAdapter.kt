package fr.docjyJ.tisseoLib.typeAdapter

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonParseException
import java.lang.reflect.Type


internal class BooleanTypeAdapter : JsonDeserializer<Boolean> {
    @Throws(JsonParseException::class)
    override fun deserialize(
            json: JsonElement, typeOfT: Type?,
            context: JsonDeserializationContext?
    ): Boolean {
        val code = json.asString
        return (if (code == "0" || code == "no") false else if (code == "1" || code == "yes") true else null)!!
    }
}
