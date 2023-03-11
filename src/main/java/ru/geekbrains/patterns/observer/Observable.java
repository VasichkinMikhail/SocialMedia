package ru.geekbrains.patterns.observer;

public interface Observable {

    void subscribe(Subscriber subscriber);
}
