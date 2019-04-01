package pl.michal.olszewski.materialy;

import static pl.michal.olszewski.materialy.EntityManagerSingleton.INSTANCE;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

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
