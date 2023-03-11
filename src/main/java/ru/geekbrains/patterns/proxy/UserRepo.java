package ru.geekbrains.patterns.proxy;

import java.util.Optional;

public interface UserRepo {

    Optional<User> findUserByUsername(String username);
}
