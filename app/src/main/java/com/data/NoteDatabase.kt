package com.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.model.Note
import com.util.UUIDConverter
import com.util.date.DateConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class , UUIDConverter::class)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun notDao(): NoteDatabaseDao
}