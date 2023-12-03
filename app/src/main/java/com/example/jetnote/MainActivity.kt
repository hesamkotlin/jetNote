package com.example.jetnote

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.data.NotesDataSource
import com.example.jetnote.ui.theme.JetNoteTheme
import com.model.Note
import com.screen.NoteViewModel
import com.screen.noteScreen

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetNoteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val noteViewModel: NoteViewModel by viewModels()
                    noteApp(noteViewModel)
                }
            }
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun noteApp(noteViewModel: NoteViewModel = viewModel()) {
    val noteList = noteViewModel.getAllNotes()
    noteScreen(
        notes = noteList,
        onAddNote = { noteViewModel.addNote(it) },
        onRemoveNote = { noteViewModel.removeNote(it) })

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetNoteTheme {
    }
}