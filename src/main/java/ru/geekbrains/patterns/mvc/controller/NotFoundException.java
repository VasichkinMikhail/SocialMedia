package ru.geekbrains.patterns.mvc.controller;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
