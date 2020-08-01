package com.uandme.kodeintest.data.repository

import androidx.lifecycle.LiveData
import com.uandme.kodeintest.data.model.Quote

interface QuoteRepository {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}