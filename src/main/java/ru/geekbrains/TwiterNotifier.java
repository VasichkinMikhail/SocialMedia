package ru.geekbrains;

import ru.geekbrains.model.TextContent;

public class TwiterNotifier implements Notifier{

    private final Notifier composite;

    public TwiterNotifier(Notifier composite) {
        this.composite = composite;
    }

    @Override
    public void send(TextContent content) {
        System.out.println("Publication in twiter : " + content);
        composite.send(content);

    }
}
