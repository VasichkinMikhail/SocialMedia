package ru.geekbrains.model;

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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
