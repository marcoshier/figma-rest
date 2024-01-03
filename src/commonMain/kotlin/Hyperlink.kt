package org.openrndr.figma.rest

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A link to either a URL or another frame (node) in the document
 * @param Type of hyperlink
 */
@Serializable
sealed interface Hyperlink {

    @Serializable
    @SerialName("URL")
    data class Url(val url: String)


    @Serializable
    @SerialName("NODE")
    data class Node(val nodeID: String)
}