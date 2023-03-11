package ru.geekbrains.dataMaper;

import ru.geekbrains.model.User;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class UserMapperImpl  implements UserMapper{

    private Map<Long, User> userMap = new HashMap<>();
    private static ThreadLocal<UserMapperImpl> current = new ThreadLocal<>();

    @Override
    public User find(long id) {
        System.out.println("111");
        Connection connection;
        try {
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","mike","password");
            PreparedStatement preparedStatement = connection.prepareStatement("select id,name,password from user  where id = ?");
            preparedStatement.setLong(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                userMap.put(id,new User(resultSet.getLong(1), resultSet.getString(2),resultSet.getString(3)));
                return new User(resultSet.getLong(1), resultSet.getString(2),resultSet.getString(3) );
            }
        } catch (SQLException e) {
            System.out.println("333");

        }
      return null;
    }
    public static UserMapperImpl getCurrent() {
        return current.get();
    }

    public static User getUser(Long id){
        User user = getCurrent().userMap.get(id);
        return user;
        }
    }

