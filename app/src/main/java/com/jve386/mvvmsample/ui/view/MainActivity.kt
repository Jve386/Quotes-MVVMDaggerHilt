/**
 * This file defines the main activity `MainActivity` for the MVVM sample application. It uses the Hilt AndroidEntryPoint
 * annotation for Dagger Hilt integration. The activity observes changes in the `QuoteViewModel` and updates the UI accordingly.
 */
package com.jve386.mvvmsample.ui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import com.jve386.mvvmsample.databinding.ActivityMainBinding
import com.jve386.mvvmsample.ui.viewmodel.QuoteViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // Use the root view of the binding

        quoteViewModel.onCreate()

        quoteViewModel.quoteModel.observe(this, Observer {
            binding.tvQuote.text = it.quote
            binding.tvAuthor.text = it.author
        })

        quoteViewModel.isLoading.observe(this, Observer {
            binding.loading.isVisible = it
        })

        binding.viewContainer.setOnClickListener { quoteViewModel.randomQuote() }
    }
}
