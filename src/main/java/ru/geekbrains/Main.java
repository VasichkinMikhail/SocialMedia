package ru.geekbrains;

import org.springframework.context.annotation.Bean;
import ru.geekbrains.builder.ContentBuilder;
import ru.geekbrains.dataMaper.Registry;
import ru.geekbrains.dataMaper.UserMapper;
import ru.geekbrains.model.Person;
import ru.geekbrains.model.TextContent;
import ru.geekbrains.model.User;
import ru.geekbrains.observe.Bot;




public class Main {
    public static void main(String[] args) {

        UserMapper userMapper = Registry.getUserMapper();

        User user = userMapper.find(1L);
        System.out.println("user "+user.getName());

        User user1 = userMapper.find(1L);
        System.out.println(" user1"+ user1.getName());



//        TextContent content = new ContentBuilder()
//                .body("Hi! It`s my first publication. ")
//                .theme("My first text")
//                .build();
//        Notifier notifier = getNotifier();
//        notifier.send(content);
//
//        Channel channel = new Channel("Mike channel");
//        Person mike = new Person("Mike");
//        Bot bot = new Bot();
//        channel.subscribe(mike);
//        channel.subscribe(bot);
//        channel.addContent(content);








    }
//    @Bean
//    private static Notifier getNotifier() {
//        return new TwiterNotifier(new FaceBookNotifier(new BaseNotifier()));
//    }
}
