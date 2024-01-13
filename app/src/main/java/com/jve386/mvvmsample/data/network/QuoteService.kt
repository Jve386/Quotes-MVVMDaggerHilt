package com.jve386.mvvmsample.data.network

import com.jve386.mvvmsample.core.RetrofitHelper
import com.jve386.mvvmsample.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class QuoteService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(QuoteApiClient::class.java).getALlQuotes()
            response.body() ?: emptyList()
        }
    }
}