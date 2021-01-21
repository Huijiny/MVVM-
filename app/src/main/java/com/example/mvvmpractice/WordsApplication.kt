package com.example.mvvmpractice

import com.example.mvvmpractice.model.WordRoomDatabase
import com.example.mvvmpractice.repository.WordRepository
import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class WordsApplication : Application() {
    val applicationScope = CoroutineScope(SupervisorJob())

    val database by lazy { WordRoomDatabase.getDatabase(this, applicationScope) }
    val repository by lazy { WordRepository(database.wordDao()) }
}