/**
 * This file defines a use case class `GetQuotesUseCase` responsible for encapsulating the business logic
 * of retrieving quotes in the MVVM sample application. It uses the provided `QuoteRepository` to fetch quotes.
 *
 * @property repository An instance of `QuoteRepository` used for retrieving quotes.
 */
package com.jve386.mvvmsample.domain

import com.jve386.mvvmsample.data.QuoteRepository
import com.jve386.mvvmsample.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(private val repository: QuoteRepository) {

    /**
     * A suspend function to invoke the use case and retrieve all quotes.
     *
     * @return A list of `QuoteModel` instances representing quotes.
     */
    suspend operator fun invoke(): List<QuoteModel> = repository.getAllQuotes()
}
