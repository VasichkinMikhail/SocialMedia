package ru.geekbrains.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


@AllArgsConstructor
@Getter
@Builder
public class User {

    private final Long id;
    private final String name;
    private final String password;


}
