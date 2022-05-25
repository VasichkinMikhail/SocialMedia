package ru.geekbrains.builder;

public class Content implements UserContent {

    private String body;
    private String theme;

    public Content(String body, String theme) {
        this.body = body;
        this.theme = theme;
    }

    @Override
    public String getBody() {
        return body;
    }

    @Override
    public String getTheme() {
        return theme;
    }
}
