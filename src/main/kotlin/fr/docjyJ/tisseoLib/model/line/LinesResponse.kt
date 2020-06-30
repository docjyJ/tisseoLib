package fr.docjyJ.tisseoLib.model.line

import java.time.LocalDateTime

data class LinesResponse (
        val expirationDate: LocalDateTime,
        val lines: Lines
)
