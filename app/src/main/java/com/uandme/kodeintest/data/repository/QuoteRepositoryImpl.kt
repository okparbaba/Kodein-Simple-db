package com.uandme.kodeintest.data.repository

import androidx.lifecycle.LiveData
import com.uandme.kodeintest.data.db.QuoteDao
import com.uandme.kodeintest.data.model.Quote

class QuoteRepositoryImpl(private val quoteDao:QuoteDao) :QuoteRepository{
    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    override fun getQuotes() = quoteDao.getQuotes()
}