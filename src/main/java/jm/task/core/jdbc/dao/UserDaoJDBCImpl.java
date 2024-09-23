package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
//    private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS users (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(20), lastname VARCHAR(20) , age INT)";
//    private static final String CREATE_USER = "INSERT INTO users(name, lastname, age) VALUES (?, ?, ?)";
//    private static final String DELETE_USER = "DELETE FROM users WHERE id = ?";
//    private static final String GET_ALL_USERS = "SELECT * FROM users";
//    private static final String DROP_TABLE = "DROP TABLE IF EXISTS users";
//    private static final String CLEAR_TABLE = "DELETE FROM users";

//    Connection connection = Util.getConnection();

    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
//    Statement statement = null;
//
//        try {
//            statement = connection.createStatement();
//            statement.executeUpdate(CREATE_TABLE);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                if (statement != null) {
//                    statement.close();
//                }
//            } catch (SQLException e) {
//                throw new RuntimeException(e);
//            }
//        }
    }

    public void dropUsersTable() {
//        Statement statement = null;
//
//        try {
//            statement = connection.createStatement();
//            statement.executeUpdate(DROP_TABLE);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (statement != null) {
//                try {
//                    statement.close();
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }

    }

    public void saveUser(String name, String lastName, byte age) {
//        PreparedStatement statement = null;
//
//        try {
//            statement = connection.prepareStatement(CREATE_USER);
//
//            statement.setString(1, name);
//            statement.setString(2, lastName);
//            statement.setInt(3, age);
//
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (statement != null) {
//                try {
//                    statement.close();
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
    }

    public void removeUserById(long id) {
//        PreparedStatement statement = null;
//
//        try {
//            statement = connection.prepareStatement(DELETE_USER);
//            statement.setLong(1, id);
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (statement != null) {
//                try {
//                    statement.close();
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }

    }

    public List<User> getAllUsers() {
//        List<User> users = new ArrayList<>();
//        PreparedStatement statement = null;
//        try {
//            statement = connection.prepareStatement(GET_ALL_USERS);
//            statement.executeQuery();
//            ResultSet resultSet = statement.getResultSet();
//            while (resultSet.next()) {
//                users.add(new User(resultSet.getString("name")
//                        , resultSet.getString("lastname")
//                        , (byte) resultSet.getInt("age")));
//                users.get(users.size() - 1).setId(resultSet.getLong("id"));
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (statement != null) {
//                try {
//                    statement.close();
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
        return null;
    }

    public void cleanUsersTable() {
//        Statement statement = null;
//
//        try {
//            statement = connection.createStatement();
//            statement.executeUpdate(CLEAR_TABLE);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (statement != null) {
//                try {
//                    statement.close();
//                } catch (SQLException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }
    }
}
