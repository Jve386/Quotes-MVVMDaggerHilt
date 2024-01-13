package com.jve386.mvvmsample.data

import com.jve386.mvvmsample.data.model.QuoteModel
import com.jve386.mvvmsample.data.model.QuoteProvider
import com.jve386.mvvmsample.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response: List<QuoteModel> = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}