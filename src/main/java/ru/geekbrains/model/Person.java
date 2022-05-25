package ru.geekbrains.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import ru.geekbrains.Channel;
import ru.geekbrains.observe.Observable;
import ru.geekbrains.observe.Subscriber;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
public class Person implements Subscriber {
    private final String name;

    @Override
    public void inform(Observable observable, Object info) {
        if (observable instanceof Channel) {
            Channel channel = (Channel) observable;
            System.out.println("I got news " + info + " from " + channel.getName());
            List<TextContent> content = channel.getContent();
        }
    }
}

