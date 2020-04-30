package com.epam.javacore2019.steve2.appserver;

public class DriverManager {

    public static Connection getConnection(String url, String username, String password){
        Connection.Builder builder = new Connection.Builder();
        builder.setUrl(url);
        builder.setUsername(username);
        builder.setPassword(password);
        Connection connection = builder.build();
        return connection;
    }
}
