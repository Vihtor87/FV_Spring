package com.example.hw9.repository;

import com.example.hw9.domian.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NoteRepository extends JpaRepository<Note, Long> {

    Optional<Note> findById(Long id);
}
