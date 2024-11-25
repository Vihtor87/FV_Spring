package org.example.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class DieselEngine implements iEngine {

    public DieselEngine() {
        System.out.println("Создан экземпляр DieselEngine");
    }
    @Override
    public void startEngine() {
        System.out.println("Запущен дизельный двигатель");
    }
}
