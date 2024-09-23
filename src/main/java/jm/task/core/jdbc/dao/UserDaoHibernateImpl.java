package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

//import static jm.task.core.jdbc.util.Util.getSessionFactory;

public class UserDaoHibernateImpl implements UserDao {
//    private static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS User (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(20), lastname VARCHAR(20) , age INT)";
//    //private static final String CREATE_USER = "INSERT INTO users(name, lastname, age) VALUES (?, ?, ?)";
//    //private static final String DELETE_USER = "DELETE FROM users WHERE id = ?";
//    private static final String GET_ALL_USERS = "from User";
//    private static final String DROP_TABLE = "DROP TABLE IF EXISTS User";
//    private static final String CLEAR_TABLE = "DELETE FROM User";

    public UserDaoHibernateImpl() {

    }


    @Override
    public void createUsersTable() {
//        Transaction transaction = null;
//
//        try (Session session = getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            session.createNativeQuery(CREATE_TABLE).executeUpdate();
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        }
    }

    @Override
    public void dropUsersTable() {
//        Transaction transaction = null;
//
//        try (Session session = getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            session.createNativeQuery(DROP_TABLE).executeUpdate();
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        }
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
//        Transaction transaction = null;
//
//        try (Session session = getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            session.save(new User(name, lastName, age));
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        }
    }

    @Override
    public void removeUserById(long id) {
//        Transaction transaction = null;
//
//        try (Session session = getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            User user = (User) session.get(User.class, id);
//            if (user != null) {
//                session.delete(user);
//            }
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        }
    }

    @Override
    public List<User> getAllUsers() {
//        List<User> users = new ArrayList<>();
//        try (Session session = getSessionFactory().openSession()) {
//            Query query = session.createQuery(GET_ALL_USERS);
//            if (!query.getResultList().isEmpty()) {
//                users = (List<User>) query.getResultList();
//            }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        return null;
    }

    @Override
    public void cleanUsersTable() {
//        Transaction transaction = null;
//        try (Session session = getSessionFactory().openSession()) {
//            transaction = session.beginTransaction();
//            session.createNativeQuery(CLEAR_TABLE).executeUpdate();
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        }
    }
}
