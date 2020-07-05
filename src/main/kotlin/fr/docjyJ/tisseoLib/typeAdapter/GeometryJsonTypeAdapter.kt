package fr.docjyJ.tisseoLib.typeAdapter

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import com.google.gson.JsonParseException
import org.locationtech.jts.geom.Geometry
import org.locationtech.jts.io.WKTReader
import java.lang.reflect.Type


internal class GeometryJsonTypeAdapter : JsonDeserializer<Geometry> {
    @Throws(JsonParseException::class)
    override fun deserialize(
        json: JsonElement, typeOfT: Type?,
        context: JsonDeserializationContext?
    ): Geometry {
        val code = json.asString
        return WKTReader().read(code)!!
    }
}
