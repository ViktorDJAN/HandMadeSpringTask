package org.example;

import org.example.framework.Context;
import org.example.model.Body;
import org.example.model.Car;
import org.example.model.Engine;

import java.lang.reflect.InvocationTargetException;

/**необходимо реализовать механизм обработки аннотации Autowired таким
 образом, чтобы она могла работать и с полями класса
 (если классе есть только дефолтный конструктор).*/

public class Main {
    public static void main(String[] args) {
        Context context = Context.load("org.example.model");
        System.out.println(context.getLoadedClasses());



        try {
            Car car = (Car) context.get("Car");
            System.out.println(car.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}