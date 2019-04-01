package pl.michal.olszewski.zadania.zad16_17;

import javax.persistence.EntityManager;
import pl.michal.olszewski.materialy.EntityManagerSingleton;

public class JPQL_Parametrized_Tasks {

  public static void main(String[] args) {

  }

  static void multiplyEmployeeSalary() {
    EntityManager entityManager = EntityManagerSingleton.INSTANCE.getEntityManager();
    entityManager.getTransaction().begin();
    entityManager.createQuery("update Employee e set e.salary = 2*e.salary").executeUpdate();
    entityManager.getTransaction().commit();
  }

  static void deleteAllEmployeesByName(String name) {
    EntityManager entityManager = EntityManagerSingleton.INSTANCE.getEntityManager();
    entityManager.createQuery("delete from Employee e where e.name=?1")
        .setParameter(1, name)
        .executeUpdate();
  }


}
