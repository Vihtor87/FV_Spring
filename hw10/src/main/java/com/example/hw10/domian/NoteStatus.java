package com.example.hw10.domian;

public enum NoteStatus {
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
            return "Выполнена";
        }
    };
}
