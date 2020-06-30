package fr.docjyJ.tisseoLib.model.journey

data class ChunkStop (
        val arrival_id:String,
        val connectionPlace: ChunkPlace,
        val departure_id: String,
        val firstTime: String,
        val lastTime: String,
        val latitude: Float,
        val longitude: Float,
        val name: String,
        val text: Text?
)
