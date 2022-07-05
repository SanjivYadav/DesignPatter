package sanjiv.dp.behavioral.observer;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Client {
    public static void main(String[] args) {
        InventryManagementService<Order> inventryManagementService = new InventryManagementService<>();
        InvoiceManagementService<Order> invoiceManagementService = new InvoiceManagementService<>();
        invoiceManagementService.register(Event.ORDER_PLACE);
        inventryManagementService.register(Event.ORDER_PLACE);
        Order order= new Order();
        order.setOder_id(1);
        order.setOrder_description("This is an order for scalar book");
        Flipkart flipkart = new Flipkart();
        flipkart.placeOrder(order);
    }
}
