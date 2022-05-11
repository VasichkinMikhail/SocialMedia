package ru.geekbrains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;


@AllArgsConstructor
@Builder(toBuilder = true)
@EqualsAndHashCode
public class User {

    private Long id;
    private String userName;
    private String phoneNumber;
    private String email;

}
