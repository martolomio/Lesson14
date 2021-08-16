
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        //create configuration object with credentials to DB
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();
//        create
//        Car car = new Car("Mark", "Libowskii");
//        session.persist(car);

        //read single entity
//        Person personFromDB = (Person) session.get(Person.class,1);
//        System.out.println(personFromDB);

        //get all from DB
//        List<Person> listOfPersons = session.createCriteria(Person.class).list();
//        listOfPersons.forEach(System.out::println);

        //update entity
//        Person personForUpdate = (Person) session.get(Person.class,1);
//        System.out.println(personForUpdate);
//        personForUpdate.setAge(38);
//        session.persist(personForUpdate);

        //delete
//        Person personDelete = (Person) session.get(Person.class,1);
//        session.delete(personDelete);

        //create
        Car car = new Car("full","BMW");
        Item item = new Item("total1");
        Item item2 = new Item("total2");
        Item item3 = new Item("total3");
        Item item4 = new Item("total4");
        car.setItems(new HashSet<>(Arrays.asList(item, item2, item3, item4)));
        session.persist(car);

        transaction.commit();

        session.close();
    }


}
