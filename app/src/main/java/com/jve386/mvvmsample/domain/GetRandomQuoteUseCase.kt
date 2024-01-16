/**
 * This file defines a use case class `GetRandomQuoteUseCase` responsible for encapsulating the business logic
 * of retrieving a random quote in the MVVM sample application. It utilizes the provided `QuoteProvider` to access
 * locally stored quotes.
 *
 * @property quoteProvider An instance of `QuoteProvider` used for accessing locally stored quotes.
 */
package com.jve386.mvvmsample.domain

import com.jve386.mvvmsample.data.model.QuoteModel
import com.jve386.mvvmsample.data.model.QuoteProvider
import javax.inject.Inject
import javax.inject.Singleton

class GetRandomQuoteUseCase @Inject constructor(private val quoteProvider: QuoteProvider) {

    /**
     * A function to invoke the use case and retrieve a random quote.
     *
     * @return A random `QuoteModel` instance, or null if no quotes are available.
     */
    operator fun invoke(): QuoteModel? {
        val quotes = quoteProvider.quotes
        return if (quotes.isNotEmpty()) {
            val randomNumber = (quotes.indices).random()
            quotes[randomNumber]
        } else {
            null
        }
    }
}
