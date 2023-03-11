package ru.geekbrains.patterns.proxy;

import lombok.*;
import ru.geekbrains.patterns.observer.Channel;
import ru.geekbrains.patterns.observer.Observable;
import ru.geekbrains.patterns.observer.Subscriber;
import ru.geekbrains.patterns.relationObject.DomainObject;
import ru.geekbrains.patterns.relationObject.Registry;
import ru.geekbrains.patterns.relationObject.UnitOfWork;
import ru.geekbrains.patterns.relationObject.UserMapper;


import java.util.List;
import java.util.Optional;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Builder
public class User extends DomainObject<Long> implements Subscriber {

    private Long Id;

    private String username;

    private String password;

    private Long jobId;

    public void setJobId(long jobId) {
        this.jobId = jobId;
        this.markDirty();
    }

    public User(String username) {
        this.username = username;
    }

    public static User create(String name, String password, Long jobId) {
        User user = new User(null, name, password, jobId);
        user.markNew();
        return user;
    }

    public static Optional<User> load(Long id) {
        Optional<User> user = UnitOfWork.getDomainObject(id, User.class);
        if (user.isEmpty()) {
            user = Registry.getMapper(User.class).find(id);
            user.ifPresent(UnitOfWork::addDomainObject);
        }
        return user;
    }

    public static Optional<User> loadByName(String name) {
        UserMapper mapper = (UserMapper) Registry.getMapper(User.class);
        Optional<User> byName = mapper.findByName(name);
        if (byName.isPresent()) {
            Optional<User> existing = UnitOfWork.getDomainObject(byName.get().getId(), User.class);
            if (existing.isPresent()) {
                return existing;
            } else {
                UnitOfWork.addDomainObject(byName.get());
            }
        }
        return byName;
    }

    public void remove() {
        this.markRemoved();
    }

    @Override
    public void inform(Observable observable, Object message) {
        if (observable instanceof Channel) {
            Channel channel = (Channel) observable;
            System.out.println("I got news " + message + " from " + channel.getName());
            List<String> news = channel.getNews();
        }
    }
}
