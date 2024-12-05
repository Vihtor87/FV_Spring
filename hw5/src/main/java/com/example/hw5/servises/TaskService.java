package com.example.hw5.servises;

import com.example.hw5.model.Task;
import com.example.hw5.model.TaskStatus;
import com.example.hw5.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepository repository;

    // Добавление новой задачи.
    public Task addTask(Task task) {
        return repository.save(task);
    }

    // Получить все задачи.
    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    // Просмотр задач по статусу
    public List<Task> findByStatus(TaskStatus status) {
        return repository.findByStatus(status);
    }

    // Изменение статуса задачи
    public Task updateTaskStatus(Long id, Task task) {
        Optional<Task> optionalTask = repository.findById(id);
        if (optionalTask.isPresent()) {
            Task ts = optionalTask.get();
            ts.setStatus(task.getStatus());
            return repository.save(ts);
        } else {
            throw new IllegalArgumentException("Task not found");
        }
    }

    // Удаление задачи
    public void deleteTask(Long id) {
        repository.deleteById(id);
    }
}
