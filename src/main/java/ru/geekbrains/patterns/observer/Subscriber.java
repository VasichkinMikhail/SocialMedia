package ru.geekbrains.patterns.observer;

public interface Subscriber {

    void inform(Observable observable, Object message);
}
