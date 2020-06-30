package fr.docjyJ.tisseoLib.model.journey

import java.time.Duration
import java.util.Date

data class Journey (
        val arrivalDateTime: Date,
        val arrivalText: Text?,
        val chunks: List<Chunk>,
        val co2_emissions: Float,
        val departureDateTime: Date,
        val duration: Duration
)
