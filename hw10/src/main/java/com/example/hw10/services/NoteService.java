package com.example.hw10.services;

import com.example.hw10.domian.Note;
import com.example.hw10.repository.NoteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NoteService {

    private final NoteRepository noteRepository;

    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public Note getNoteById(Long id) {
        return noteRepository.findById(id).orElseThrow(null);
    }

    public Note updateNote(Note note) {
        Note noteByID = getNoteById(note.getId());
        noteByID.setTitle(note.getTitle());
        noteByID.setDescription(note.getDescription());
        return noteRepository.save(noteByID);
    }

    public void deleteNote(Long id) {
        Note noteById = getNoteById(id);
        noteRepository.delete(noteById);
    }
}

