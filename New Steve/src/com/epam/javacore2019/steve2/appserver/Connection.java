package com.epam.javacore2019.steve2.appserver;

public class Connection {

    private String url;
    private String username;
    private String password;

    private Connection() {};

    public static class Builder {
        private Connection connection;

        public Builder () {
            connection = new Connection();
        }

        public void setUrl(String url) {
            connection.setUrl(url);
        }

        public void setUsername(String username) {
            connection.setUsername(username);
        }

        public void setPassword(String password) {
            connection.setPassword(password);
        }

        public Connection build() {
            return connection;
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void close() {

    }
}
