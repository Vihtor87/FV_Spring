package com.example.hw10;

import com.example.hw10.domian.Note;
import com.example.hw10.repository.NoteRepository;
import com.example.hw10.services.NoteService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;

import static com.example.hw10.domian.NoteStatus.COMPLETED;
import static com.example.hw10.domian.NoteStatus.IN_PROGRESS;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class CreateNoteTest {

    @Mock
    public NoteRepository noteRepository;

    @InjectMocks
    public NoteService noteService;

    @Test
    void createNoteTest() {
        //pre
        Note note1 = new Note();
        note1.setId(1L);
        note1.setStatus(IN_PROGRESS);
        note1.setTitle("Тестовая заметка");
        note1.setDescription("Описание тестовой заметки");

        given(noteRepository.findById(note1.getId())).willReturn(Optional.of(note1));

        //action
        noteService.getNoteById(note1.getId());

        //assert
        verify(noteRepository).findById(1L);

    }
}
