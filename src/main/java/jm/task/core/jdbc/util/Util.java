package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class Util {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();
                Properties settings = getSettings();
                configuration.setProperties(settings);
                configuration.addAnnotatedClass(User.class);
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties())
                        .build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return sessionFactory;
    }

    private static Properties getSettings() {
        Properties settings = new Properties();

        settings.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
        settings.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        settings.put("hibernate.connection.url", "jdbc:mysql://private.oxfraud.cc:3306/user_pp");
        settings.put("hibernate.connection.username", "user_pp_base");
        settings.put("hibernate.connection.password", "5378211vV//");

        settings.put("hibernate.show_sql", "true");
        settings.put("hibernate.hbm2ddl.auto", "create-drop");

        settings.put("hibernate.current_session_context_class", "thread");
        return settings;
    }
}
