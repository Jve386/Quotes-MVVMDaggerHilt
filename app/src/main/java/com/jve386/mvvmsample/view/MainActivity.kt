package com.jve386.mvvmsample.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.jve386.mvvmsample.R
import com.jve386.mvvmsample.databinding.ActivityMainBinding
import com.jve386.mvvmsample.viewmodel.QuoteViewModel

class MainActivity : ComponentActivity() {
    private lateinit var binding:ActivityMainBinding
    private val quoteViewModel : QuoteViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        quoteViewModel.quoteModel.observe(this, Observer {
            binding.tvQuote.text = it.quote
            binding.tvAuthor.text = it.author
        })

        binding.viewContainer.setOnClickListener{ quoteViewModel.randomQuote()}    }
}