package org.example.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private String model = "Model";
    private String made = "Made";
    @Autowired
    private iEngine carEngine;

    public Car(iEngine engine) {
        this.carEngine = engine;
        System.out.println("Автомобиль создан!");
    }

    public void go() {
        carEngine.startEngine();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public iEngine getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(iEngine carEngine) {
        this.carEngine = carEngine;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model = '" + model + '\'' +
                ", made = '" + made + '\'' +
                '}';
    }
}
