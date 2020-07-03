package fr.docjyJ.tisseoLib.model.line


import com.google.gson.annotations.SerializedName
import org.locationtech.jts.geom.Geometry

data class GeometryX(
    @SerializedName("wkt")
    val wkt: Geometry
)
