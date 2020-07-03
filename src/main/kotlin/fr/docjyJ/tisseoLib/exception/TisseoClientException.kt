package fr.docjyJ.tisseoLib.exception

/**
 * Indicates that an error was reached during a library action.
 */
class TisseoClientException internal constructor(message: String, cause: Throwable) : Exception(message, cause) {

    companion object{
        internal const val ENCODE_PARAMETER = "Unable to encode the parameters."
        internal const val PARSE_OBJECT = "Unable to parse the response."
        internal const val READ_RESPONSE = "Unable to read the response."
        internal const val CREATE_REQUEST = "Unable to create the request."
    }
}
