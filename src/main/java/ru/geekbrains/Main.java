package ru.geekbrains;

public class Main {
    public static void main(String[] args) {
        TextContent content = new ContentBuilder()
                .body("Hi! It`s my first publication. ")
                .theme("My first text")
                .build();

//        User user = User.builder()
//                .id(1L)
//                .userName("Bob")
//                .phoneNumber("89099990099")
//                .email("bob@gmail.com")
//                .build();

        System.out.println(content.toString());
    }
}
