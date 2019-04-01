package pl.michal.olszewski;

import static pl.michal.olszewski.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityTransaction;

public class DeleteEmployee {

  public static void main(String[] args) {
    EntityTransaction transaction = INSTANCE.getEntityManager().getTransaction();
    transaction.begin();
    Employee employee = INSTANCE.getEntityManager().find(Employee.class, 3L);
    INSTANCE.getEntityManager().remove(employee);
    transaction.commit();
  }

}
