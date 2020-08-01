package com.uandme.kodeintest.ui.quote

import androidx.lifecycle.ViewModel
import com.uandme.kodeintest.data.model.Quote
import com.uandme.kodeintest.data.repository.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) :ViewModel(){
    fun addQuote(quote:Quote) = quoteRepository.addQuote(quote)
    fun getQuotes() = quoteRepository.getQuotes()
}