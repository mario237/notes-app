package com.example.notesapp.Listeners;

import com.example.notesapp.Entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note , int position);
}
