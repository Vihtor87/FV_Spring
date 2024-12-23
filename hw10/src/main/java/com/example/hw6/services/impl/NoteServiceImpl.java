package com.example.hw6.services.impl;

import com.example.hw6.domian.Note;
import com.example.hw6.repository.NoteRepository;
import com.example.hw6.services.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;

    @Override
    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    @Override
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Note getNoteById(Long id) {
        return noteRepository.findById(id).orElseThrow(null);
    }

    @Override
    public Note updateNote(Note note) {
        Note noteByID = getNoteById(note.getId());
        noteByID.setTitle(note.getTitle());
        noteByID.setDescription(note.getDescription());
        return noteRepository.save(noteByID);
    }

    @Override
    public void deleteNote(Long id) {
        Note noteById = getNoteById(id);
        noteRepository.delete(noteById);
    }
}
