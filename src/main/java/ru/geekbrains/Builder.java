package ru.geekbrains;

public interface Builder {
    Builder body(String body);
    Builder theme(String theme);

    TextContent build();
}
