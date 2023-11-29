package com.data

import android.os.Build
import androidx.annotation.RequiresApi
import com.model.Note

class NotesDataSource{
    @RequiresApi(Build.VERSION_CODES.O)
    fun loadNotes(): List<Note>{
        return listOf(
            Note(title = "a good day", description = "we vent to a vacation blah blah"),
            Note(title = "a good day", description = "we vent to a vacation blah blah"),
            Note(title = "a good day", description = "we vent to a vacation blah blah"),
            Note(title = "a good day", description = "we vent to a vacation blah blah"),
            Note(title = "a good day", description = "we vent to a vacation blah blah"),
            Note(title = "a good day", description = "we vent to a vacation blah blah"),
            Note(title = "a good day", description = "we vent to a vacation blah blah"),
        )
    }
}