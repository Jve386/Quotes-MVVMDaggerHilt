/**
 * This file defines the ViewModel class `QuoteViewModel` for the MVVM sample application. It uses HiltViewModel
 * for Dagger Hilt integration. The ViewModel communicates with the domain layer through the injected use cases.
 */
package com.jve386.mvvmsample.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jve386.mvvmsample.data.model.QuoteModel
import com.jve386.mvvmsample.domain.GetQuotesUseCase
import com.jve386.mvvmsample.domain.GetRandomQuoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuoteViewModel @Inject constructor(
    private val getQuotesUseCase: GetQuotesUseCase,
    private val getRandomQuoteUseCase: GetRandomQuoteUseCase
) : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()
    val isLoading = MutableLiveData<Boolean>()

    /**
     * Function to be called during the creation of the ViewModel.
     * Initiates the process of fetching quotes and updating the UI accordingly.
     */
    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getQuotesUseCase()
            if (!result.isNullOrEmpty()) {
                quoteModel.postValue(result[0])
            }
            isLoading.postValue(false)
        }
    }

    /**
     * Function to fetch and display a random quote.
     */
    fun randomQuote() {
        isLoading.postValue(true)

        val quote = getRandomQuoteUseCase()

        if (quote != null) {
            quoteModel.postValue(quote)
        }
        isLoading.postValue(false)
    }
}
