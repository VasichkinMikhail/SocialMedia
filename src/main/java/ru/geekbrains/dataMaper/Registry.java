package ru.geekbrains.dataMaper;


public class Registry {

    private static Registry instance = new Registry();

    public static Registry getInstance() {
        return instance;
    }

    protected UserMapper userMapper = new UserMapperImpl();

    public static UserMapper getUserMapper(){
        return getInstance().userMapper;
    }

    public static void reinit(){
        instance = new Registry();
    }
}

