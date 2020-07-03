package fr.docjyJ.tisseoLib.response

import java.time.LocalDateTime

/**
 * The response class of a request.
 *
 * @property expirationDate The expiration date of the content.
 */

interface TisseoResponse{
    val expirationDate: LocalDateTime
}
