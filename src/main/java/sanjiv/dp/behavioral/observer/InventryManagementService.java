package sanjiv.dp.behavioral.observer;

public class InventryManagementService<T> implements Subscriber<T>{
    @Override
    public void listen(T t) {
        updateInventory(t);
    }
    public void updateInventory(T t){
        System.out.println("Inventory updated successfully for "+t);
    }
    public void register(Event e){
        Flipkart.registerSubscriber(e, this);
    }
}
