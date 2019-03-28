package pl.michal.olszewski;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class DetachEntity {

    public static void main(String[] args) {
        EntityManager em = INSTANCE.getEntityManager();

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Employee employee = em.find(Employee.class, 1L);
        em.detach(employee);
        employee.setName("12345Nowyxxxyyy");
        em.merge(employee);
        transaction.commit();
    }

}
