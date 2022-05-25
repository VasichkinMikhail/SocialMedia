package ru.geekbrains;

import ru.geekbrains.model.TextContent;

public class BaseNotifier implements Notifier{
    @Override
    public void send(TextContent content) {
        System.out.println(content);
    }
}
