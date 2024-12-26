package com.example.hw11.repository;

import com.example.hw11.model.Task;
import com.example.hw11.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    // Получить список задач по их статусу
    List<Task> findByStatus(TaskStatus status);
}
