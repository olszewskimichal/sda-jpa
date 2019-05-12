package pl.michal.olszewski.materialy;

import pl.michal.EntityManagerCreator;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OneToManyExample {
    public static void main(String[] args) {
        EntityManager entityManager = EntityManagerCreator.getEntityManager();
        entityManager.getTransaction().begin();
        Order order = new Order(LocalDateTime.now(), BigDecimal.TEN);

        order.getOrderProducts().add(new OrderProduct("prod1"));
        order.getOrderProducts().add(new OrderProduct("prod2"));
        order.getOrderProducts().add(new OrderProduct("prod3"));

        entityManager.persist(order);

        entityManager.getTransaction().commit();
    }
}
