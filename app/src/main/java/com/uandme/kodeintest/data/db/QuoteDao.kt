package com.uandme.kodeintest.data.db

import androidx.lifecycle.LiveData
import com.uandme.kodeintest.data.model.Quote

interface QuoteDao {
    fun addQuote(quote:Quote)
    fun getQuotes():LiveData<List<Quote>>
}