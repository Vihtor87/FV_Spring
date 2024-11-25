package com.example.lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Car {
    @Autowired
    Engine engine;

    public void start() {
        engine.go();
    }

//    public Car(Engine engine) {
//        this.engine = engine;
//        engine.go();
//    }
}
