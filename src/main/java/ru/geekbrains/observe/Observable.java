package ru.geekbrains.observe;

public interface Observable {
    void subscribe(Subscriber subscriber);
}
