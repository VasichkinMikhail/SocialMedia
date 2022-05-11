package ru.geekbrains;

public class TextContent implements UserContent {

    private String body;
    private String theme;

    public TextContent(String body, String theme) {
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

    @Override
    public String toString() {
        return "TextContent{" +'\n'+
                " Theme='" + theme + '\n' +
                "Text='" + body + '\n' +
                '}';
    }
}
