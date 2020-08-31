package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {

    private static UserDao userDaoHibernate;

    static {
            userDaoHibernate = new UserDaoHibernateImpl();
    }

    public void createUsersTable() throws SQLException, ClassNotFoundException, IOException {
        userDaoHibernate.createUsersTable();
    }

    public void dropUsersTable() throws IOException, SQLException {
        userDaoHibernate.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws IOException, SQLException {
        userDaoHibernate.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) throws IOException, SQLException {
        userDaoHibernate.removeUserById(id);
    }

    public List<User> getAllUsers() throws IOException, SQLException {
        return userDaoHibernate.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException, IOException {
        userDaoHibernate.cleanUsersTable();
    }
}
