package com.example.hw12.repository;

import com.example.hw12.model.Task;
import com.example.hw12.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    // Получить список задач по их статусу
    List<Task> findByStatus(TaskStatus status);
}
