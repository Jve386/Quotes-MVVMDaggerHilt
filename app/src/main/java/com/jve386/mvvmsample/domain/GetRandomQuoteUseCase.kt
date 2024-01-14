package com.jve386.mvvmsample.domain

import com.jve386.mvvmsample.data.QuoteRepository
import com.jve386.mvvmsample.data.model.QuoteModel
import com.jve386.mvvmsample.data.model.QuoteProvider
import javax.inject.Inject
import javax.inject.Singleton

class GetRandomQuoteUseCase @Inject constructor(private val quoteProvider: QuoteProvider) {

    operator fun invoke():QuoteModel?{
        val quotes = quoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}