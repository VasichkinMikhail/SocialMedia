package ru.geekbrains;

public class ContentBuilder implements Builder{

    private String body;
    private String theme;

    @Override
    public Builder body(String body) {
        this.body = body;
        return this;
    }

    @Override
    public Builder theme(String theme) {
        this.theme = theme;
        return this;
    }

    @Override
    public TextContent build() {
        return new TextContent(body, theme);
    }
}
