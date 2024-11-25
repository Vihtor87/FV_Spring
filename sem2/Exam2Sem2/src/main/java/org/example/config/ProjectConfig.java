package org.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "org.example.domain")
public class ProjectConfig {

//    @Bean
//    Engine engine() {
//        Engine eng = new Engine();
//        return eng;
//    }
//
//    @Bean
//    Car car() {
//        Car obCar = new Car();
//        obCar.setCarEngine(engine());
//        obCar.setModel("S8");
//        obCar.setMade("Audi");
//        return obCar;
//    }
}
