package fr.docjyJ.tisseoLib.model.journey

import java.time.Duration
import java.time.LocalDateTime

data class Journey (
        val arrivalDateTime: LocalDateTime,
        val arrivalText: Text?,
        val chunks: List<Chunk>,
        val co2_emissions: Float,
        val departureDateTime: LocalDateTime,
        val duration: Duration
)
