package com.example.hw12.model;

public enum TaskStatus {
    NOT_STARTED {
        @Override
        public String toString() {
            return "Не начата";
        }
    }, IN_PROGRESS {
        @Override
        public String toString() {
            return "В процессе";
        }
    }, COMPLETED {
        @Override
        public String toString() {
            return "Завершена";
        }
    };
}
