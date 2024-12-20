package com.example.hw6.repository;

import com.example.hw6.domian.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NoteRepository extends JpaRepository<Note, Long> {

    Optional<Note> findById(Long id);
}
