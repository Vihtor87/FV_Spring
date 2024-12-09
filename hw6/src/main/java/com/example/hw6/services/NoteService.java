package com.example.hw6.services;

import com.example.hw6.domian.Note;
import java.util.List;

public interface NoteService {

    Note createNote(Note note);

    List<Note> getAllNotes();

    Note getNoteById(Long id);

    Note updateNote(Note note);

    void deleteNote(Long id);
}
