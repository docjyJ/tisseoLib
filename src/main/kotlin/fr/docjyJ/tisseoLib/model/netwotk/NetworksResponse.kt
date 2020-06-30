package fr.docjyJ.tisseoLib.model.netwotk

import java.time.LocalDateTime

data class NetworksResponse(
        val expirationDate: LocalDateTime,
        val networks: List<Networks>
)
