package com.uandme.kodeintest

import android.app.Application
import com.uandme.kodeintest.data.db.Database
import com.uandme.kodeintest.data.db.DatabaseFakeImpl
import com.uandme.kodeintest.data.db.QuoteDao
import com.uandme.kodeintest.data.repository.QuoteRepository
import com.uandme.kodeintest.data.repository.QuoteRepositoryImpl
import com.uandme.kodeintest.ui.quote.QuoteViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class QuotesApplication :Application(),KodeinAware{
    override val kodein: Kodein = Kodein.lazy {
        bind<Database>() with singleton { DatabaseFakeImpl() }
        bind<QuoteDao>() with singleton { instance<Database>().quoteDao }
        bind<QuoteRepository>() with singleton { QuoteRepositoryImpl(instance()) }
        bind() from  provider { QuoteViewModelFactory(instance()) }
    }
}