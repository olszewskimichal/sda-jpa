package pl.michal.olszewski;

import javax.persistence.EntityTransaction;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

public class UpdateEmployee {

    public static void main(String[] args) {
        EntityTransaction transaction = INSTANCE.getEntityManager().getTransaction();
        transaction.begin();
        Employee employee = INSTANCE.getEntityManager().find(Employee.class, 1L);
        employee.setName("12345Nowy");
        transaction.commit();
    }

}
