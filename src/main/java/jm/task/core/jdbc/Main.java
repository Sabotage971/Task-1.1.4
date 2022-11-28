package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        final UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Oleg", "Olegov", (byte) 25);
        userService.saveUser("Maks", "Maksimov", (byte) 26);
        userService.saveUser("Roman", "Romanov", (byte) 27);
        userService.saveUser("Sergey", "Sergeev", (byte) 28);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
