package com.jve386.mvvmsample.domain

import com.jve386.mvvmsample.data.QuoteRepository
import com.jve386.mvvmsample.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(private val repository: QuoteRepository) {
    suspend operator fun invoke() = repository.getAllQuotes()
}
