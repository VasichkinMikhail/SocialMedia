package ru.geekbrains;

import ru.geekbrains.model.TextContent;

public class FaceBookNotifier implements Notifier{

    private final Notifier composite;

    public FaceBookNotifier(Notifier composite) {
        this.composite = composite;
    }

    @Override
    public void send(TextContent content) {
        System.out.println("Publication in facebook : " + content);
        composite.send(content);

    }
}
