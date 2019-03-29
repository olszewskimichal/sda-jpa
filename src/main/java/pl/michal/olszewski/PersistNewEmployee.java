package pl.michal.olszewski;

import javax.persistence.EntityTransaction;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class PersistNewEmployee {

    public static void main(String[] args) {
        EntityTransaction transaction = INSTANCE.getEntityManager().getTransaction();
        transaction.begin();
        Employee employee = new Employee("nowynowy1", 12341L);
        INSTANCE.getEntityManager().persist(employee);
        transaction.commit();
        System.err.println(employee);
    }

}
