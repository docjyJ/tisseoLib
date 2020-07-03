package fr.docjyJ.tisseoLib.typeAdapter

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonParseException
import java.awt.Color
import java.lang.reflect.Type


internal class ColorTypeAdapter : JsonDeserializer<Color> {
    @Throws(JsonParseException::class)
    override fun deserialize(
            json: JsonElement, typeOfT: Type?,
            context: JsonDeserializationContext?
    ): Color {
        val code = json.asString
        return Color.decode(code)!!
    }
}
