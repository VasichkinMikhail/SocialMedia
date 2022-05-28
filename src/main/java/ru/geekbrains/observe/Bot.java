package ru.geekbrains.observe;

import ru.geekbrains.Channel;

public class Bot implements Subscriber {
    @Override
    public void inform(Observable observable, Object info) {
        if (observable instanceof Channel) {
            Channel channel = (Channel) observable;
            System.out.println("I'm processing message: " + info + " from " + channel.getName());
        }
    }
}
