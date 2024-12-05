package com.example.hw5.comtroller;

import com.example.hw5.model.Task;
import com.example.hw5.model.TaskStatus;
import com.example.hw5.servises.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

public class ControllerTask {

    @RestController
    @RequestMapping("/tasks")
    @AllArgsConstructor
    public static class TaskController {
        private final TaskService taskService;

        // Добавление задачи в список
        @PostMapping
        public Task addTask(@RequestBody Task task) {
            task.setCreatedDate(LocalDateTime.now());
            return taskService.addTask(task);
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
