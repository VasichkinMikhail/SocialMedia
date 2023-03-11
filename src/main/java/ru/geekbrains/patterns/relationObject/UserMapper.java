package ru.geekbrains.patterns.relationObject;


import ru.geekbrains.patterns.proxy.User;

import java.util.Optional;

public interface UserMapper extends Mapper<User, Long> {

    Optional<User> findByName(String name);
}
