/**
 * This file defines a service class `QuoteService` responsible for interacting with the quote-related API
 * in the MVVM sample application. It uses the provided `QuoteApiClient` to make network requests for retrieving quotes.
 *
 * @property api An instance of `QuoteApiClient` used for making network requests.
 */
package com.jve386.mvvmsample.data.network

import com.jve386.mvvmsample.core.RetrofitHelper
import com.jve386.mvvmsample.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class QuoteService @Inject constructor(private val api: QuoteApiClient) {

    /**
     * A suspend function to get quotes from the API.
     *
     * @return A list of `QuoteModel` instances retrieved from the API response.
     */
    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getALlQuotes()
            response.body() ?: emptyList()
        }
    }
}
