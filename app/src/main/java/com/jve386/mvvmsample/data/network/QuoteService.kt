package com.jve386.mvvmsample.data.network

import com.jve386.mvvmsample.core.RetrofitHelper
import com.jve386.mvvmsample.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class QuoteService @Inject constructor(private val api: QuoteApiClient) {

    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            val response = api.getALlQuotes()
            response.body() ?: emptyList()
        }
    }
}