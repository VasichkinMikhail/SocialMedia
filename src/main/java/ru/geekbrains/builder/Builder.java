package ru.geekbrains.builder;

import ru.geekbrains.model.TextContent;

public interface Builder {
    Builder body(String body);
    Builder theme(String theme);

    TextContent build();
}
