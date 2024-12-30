package com.example.hw12.controller;

import com.example.hw12.model.Task;
import com.example.hw12.model.TaskStatus;
import com.example.hw12.servises.FileGateway;
import com.example.hw12.servises.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

public class ControllerTask {

    @RestController
    @RequestMapping("/tasks")
    @AllArgsConstructor
    public static class TaskController {
        private final TaskService taskService;
        private final FileGateway fileGateway;

        // Добавление задачи в список
        @PostMapping
        public ResponseEntity<Task> addTask(@RequestBody Task task) {
            task.setCreatedDate(LocalDateTime.now());
            fileGateway.writeToFile(task.getTask_name() + ".txt", task.toString());
            return new ResponseEntity<>(HttpStatus.OK);
        }

        // Получение списка всех задач.
        @GetMapping
        public List<Task> getAllTasks() {
            return taskService.getAllTasks();
        }

        // Просмотр задач по статусу
        @GetMapping("/status/{status}")
        public List<Task> findByStatus(@PathVariable TaskStatus status) {
            return taskService.findByStatus(status);
        }


        // Обновление статуса задачи по её id
        @PutMapping("/{id}")
        public Task updateTaskStatus(@PathVariable Long id, @RequestBody Task task) {
            return taskService.updateTaskStatus(id, task);
        }

        // Удаление задачи по её ID
        @DeleteMapping("/{id}")
        public void deleteTask(@PathVariable Long id) {
            taskService.deleteTask(id);
        }
    }
}
