package com.jve386.mvvmsample.data.network


import com.jve386.mvvmsample.data.model.QuoteModel
import retrofit2.http.GET
import retrofit2.Response

interface QuoteApiClient {
    @GET("/.json")
    suspend fun getALlQuotes(): Response<List<QuoteModel>>
}