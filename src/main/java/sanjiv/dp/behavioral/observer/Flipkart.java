package sanjiv.dp.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Flipkart {
    private static Map<Event, ArrayList<Subscriber>> map = new HashMap<>();
    public static void registerSubscriber(Event event, Subscriber subscriber){
        if(!map.containsKey(event)){
            map.put(event, new ArrayList<>());
        }
        map.get(event).add(subscriber);
    }

    public void notify(Event event, Order order){
        for(Subscriber s : map.get(event)){
            s.listen(order);
        }
    }

    public void placeOrder(Order order){
        notify(Event.ORDER_PLACE,order);
        System.out.println("Order Placed successfully");
    }
}
