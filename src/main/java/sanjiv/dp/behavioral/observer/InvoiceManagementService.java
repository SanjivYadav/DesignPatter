package sanjiv.dp.behavioral.observer;

public class InvoiceManagementService<T> implements Subscriber<T>{
    @Override
    public void listen(T t) {
        generateInvoice(t);
    }
    public void generateInvoice(T t){
        System.out.println("Invoice generated successfully for"+t);
    }

    public void register(Event e){
        Flipkart.registerSubscriber(e, this);
    }
}
