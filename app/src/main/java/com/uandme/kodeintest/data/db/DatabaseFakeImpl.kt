package com.uandme.kodeintest.data.db

class DatabaseFakeImpl:Database {
    override val quoteDao: QuoteDao = QuoteDaoFakeImpl()
}