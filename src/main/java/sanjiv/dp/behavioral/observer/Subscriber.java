package sanjiv.dp.behavioral.observer;

public interface Subscriber<T>{
    void listen(T t);
}
