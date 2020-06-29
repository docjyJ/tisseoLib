package fr.docjyJ.tisseoLib.model

data class Journey(
        val arrivalDateTime: String,
        val arrivalText: Text,
        val chunks: List<Chunk>,
        val co2_emissions:String,
        val departureDateTime:String,
        val duration:String
)
