/**
 * This file defines a Retrofit API interface `QuoteApiClient` for making network requests related to quotes
 * in the MVVM sample application. It includes a function annotated with `@GET` to retrieve all quotes from a specific endpoint.
 *
 * @property getALlQuotes A suspend function representing the API endpoint to get all quotes.
 */
package com.jve386.mvvmsample.data.network

import com.jve386.mvvmsample.data.model.QuoteModel
import retrofit2.http.GET
import retrofit2.Response

interface QuoteApiClient {

    /**
     * A suspend function representing the API endpoint to get all quotes.
     *
     * @return A Retrofit `Response` containing a list of `QuoteModel` instances.
     */
    @GET("/.json")
    suspend fun getALlQuotes(): Response<List<QuoteModel>>
}
