package com.uandme.kodeintest.ui.quote

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.uandme.kodeintest.data.repository.QuoteRepository

class QuoteViewModelFactory(private val quoteRepository:QuoteRepository) :ViewModelProvider.NewInstanceFactory(){
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quoteRepository) as T
    }
}