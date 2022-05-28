package ru.geekbrains;

import lombok.Builder;
import lombok.Getter;
import ru.geekbrains.model.TextContent;
import ru.geekbrains.observe.Observable;
import ru.geekbrains.observe.Subscriber;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
public class Channel implements Observable {
    private final String name;
    private final List<TextContent> content = new ArrayList<>();
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void addContent(TextContent content){
        this.content.add(content);
        subscribers.forEach(subscriber -> subscriber.inform(this, content));
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
}
