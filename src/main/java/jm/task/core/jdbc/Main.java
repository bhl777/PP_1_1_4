package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Alex", "First", (byte) 25);
        userService.saveUser("Dmitri", "Second", (byte) 55);
        userService.saveUser("Petr", "Petrov", (byte) 19);
        userService.saveUser("Viktor", "Demin", (byte) 38);

        List<User> userList = userService.getAllUsers();
        userList.forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
