package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.io.IOException;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {

        UserService userService = new UserServiceImpl();
        userService.dropUsersTable();
        userService.createUsersTable();

        userService.saveUser("dfer", "bt", (byte) 19);
        System.out.println(userService.getAllUsers());
    }
}
