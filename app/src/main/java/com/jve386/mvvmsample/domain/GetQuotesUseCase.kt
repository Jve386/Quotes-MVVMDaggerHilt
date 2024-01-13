package com.jve386.mvvmsample.domain

import com.jve386.mvvmsample.data.QuoteRepository
import com.jve386.mvvmsample.data.model.QuoteModel

class GetQuotesUseCase {
    private val repository = QuoteRepository()

    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()
}
