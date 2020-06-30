package fr.docjyJ.tisseoLib.model.netwotk

import java.util.Date

data class NetworksResponse(
        val expirationDate: Date,
        val networks: List<Networks>
)
