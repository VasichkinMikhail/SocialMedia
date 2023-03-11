package ru.geekbrains.observe;


public interface Subscriber {

    void inform(Observable observable, Object info);
}
