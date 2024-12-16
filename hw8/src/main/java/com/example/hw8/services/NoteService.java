package com.example.hw8.services;

import com.example.hw8.aspects.TrackUserAction;
import com.example.hw8.model.Note;
import com.example.hw8.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteService {

    @Autowired
    private final NoteRepository noteRepository;

    @TrackUserAction
    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    @TrackUserAction
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @TrackUserAction
    public Note getNoteById(Long id) {
        return noteRepository.findById(id).orElseThrow(null);
    }

    @TrackUserAction
    public Note updateNote(Note note) {
        Note noteByID = getNoteById(note.getId());

        noteByID.setTitle(note.getTitle());
        noteByID.setContent(note.getContent());

        return noteRepository.save(noteByID);
    }

    @TrackUserAction
    public void deleteNote(Long id) {
        Note noteById = getNoteById(id);
        noteRepository.delete(noteById);
    }
}
