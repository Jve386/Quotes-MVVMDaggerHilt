package com.jve386.mvvmsample.data

import com.jve386.mvvmsample.data.model.QuoteModel
import com.jve386.mvvmsample.data.model.QuoteProvider
import com.jve386.mvvmsample.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api: QuoteService,
    private val quoteProvider: QuoteProvider
) {

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}