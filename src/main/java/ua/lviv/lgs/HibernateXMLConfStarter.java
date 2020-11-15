package ua.lviv.lgs;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Arrays;
import java.util.HashSet;

public class HibernateXMLConfStarter {
    public static void main(String[] args) {

    //Create configaration object with credentionals to be
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

      //  ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

        SessionFactory factory = configuration.buildSessionFactory();

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();

        Cart cart = new Cart(123,"кіняча повізка");
        Item item = new Item(123,"помідори");
        Item item2 = new Item(13124,"огірки");
        session.persist(item);
        session.persist(item2);
        cart.setItems(new HashSet<>(Arrays.asList(item,item2)));
        session.persist(cart);

        transaction.commit();
        session.close();
    }
}
