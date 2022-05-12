package ru.geekbrains;

import org.springframework.context.annotation.Bean;
import ru.geekbrains.builder.ContentBuilder;
import ru.geekbrains.model.TextContent;


public class Main {
    public static void main(String[] args) {
        TextContent content = new ContentBuilder()
                .body("Hi! It`s my first publication. ")
                .theme("My first text")
                .build();
        Notifier notifier = getNotifier();
        notifier.send(content);


//        User user = User.builder()
//                .id(1L)
//                .userName("Bob")
//                .phoneNumber("89099990099")
//                .email("bob@gmail.com")
//                .build();



//        System.out.println(content.toString());
    }
    @Bean
    private static Notifier getNotifier() {
        return new TwiterNotifier(new FaceBookNotifier(new BaseNotifier()));
    }
}
