package com.example.food;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class FoodListener {

    @StreamListener(target = Sink.INPUT)
    public void processCheapMeals(FoodOrder foodOrder) {
        System.out.println(foodOrder.getRestaurant());
    }

}
