package pl.michal.olszewski.zadania.zad9;

import java.util.Random;
import javax.persistence.EntityManager;
import pl.michal.olszewski.materialy.Employee;
import pl.michal.olszewski.materialy.EntityManagerSingleton;

public class Zad9 {

  public static void main(String[] args) {

  }


  static void getEmployeeSalary(Long id) {
    EntityManager entityManager = EntityManagerSingleton.INSTANCE.getEntityManager();
    Employee employee = entityManager.find(Employee.class, id);
    if (employee != null) {
      System.out.println(employee.getSalary());
    } else {
      System.err.println("Pracownik o id =" + id + " nie istnieje");
    }
  }

  static void insertNewEmployees(int n) {
    EntityManager entityManager = EntityManagerSingleton.INSTANCE.getEntityManager();
    entityManager.getTransaction().begin();
    for (int i = 0; i < n; i++) {
      entityManager.persist(new Employee("name" + i, (long) new Random().nextInt(2000)));
    }
    entityManager.getTransaction().commit();
  }

  static void removeEmployeeById(Long id) {
    EntityManager entityManager = EntityManagerSingleton.INSTANCE.getEntityManager();
    entityManager.getTransaction().begin();

    Employee employee = entityManager.find(Employee.class, id);
    entityManager.remove(employee);

    entityManager.getTransaction().commit();
  }

}
