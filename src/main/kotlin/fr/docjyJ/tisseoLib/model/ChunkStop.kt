package fr.docjyJ.tisseoLib.model

data class ChunkStop (
        val arrival_id:String,
        val connectionPlace: Place,
        val departure_id:String,
        val firstTime:String,
        val lastTime:String,
        val latitude:String,
        val longitude:String,
        val name:String,
        val text:Text
)
