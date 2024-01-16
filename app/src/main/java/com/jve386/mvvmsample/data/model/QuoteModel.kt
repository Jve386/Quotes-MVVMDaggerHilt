/**
 * This file defines a data class `QuoteModel` representing the structure of a quote in the MVVM sample application.
 *
 * @property quote The actual quote content.
 * @property author The author of the quote.
 */
package com.jve386.mvvmsample.data.model

import com.google.gson.annotations.SerializedName

data class QuoteModel(
    @SerializedName("quote") val quote: String,
    @SerializedName("author") val author: String
)
