package fr.docjyJ.tisseoLib.response

import java.time.LocalDateTime

/**
 * The class builder to do a Message request.
 *
 * @constructor Create new request builder with no parameters.
 *
 * @property expirationDate The expiration date of the content.
 */

interface TisseoResponse{
    val expirationDate: LocalDateTime
}
