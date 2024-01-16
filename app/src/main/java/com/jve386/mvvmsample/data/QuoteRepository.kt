/**
 * This file defines a repository class `QuoteRepository` responsible for acting as an intermediary between
 * the data source (API) and the application. It utilizes the provided `QuoteService` for fetching quotes and
 * updates the local `QuoteProvider` with the retrieved quotes.
 *
 * @property api An instance of `QuoteService` used for making network requests.
 * @property quoteProvider An instance of `QuoteProvider` used for managing and providing quotes locally.
 */
package com.jve386.mvvmsample.data

import com.jve386.mvvmsample.data.model.QuoteModel
import com.jve386.mvvmsample.data.model.QuoteProvider
import com.jve386.mvvmsample.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api: QuoteService,
    private val quoteProvider: QuoteProvider
) {

    /**
     * A suspend function to retrieve all quotes from the API and update the local provider.
     *
     * @return A list of `QuoteModel` instances retrieved from the API response.
     */
    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}
