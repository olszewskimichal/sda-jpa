package pl.michal.olszewski.materialy;

import pl.michal.EntityManagerCreator;

import javax.persistence.EntityManager;

public class OneToOneExample {
    public static void main(String[] args) {
        EntityManager entityManager = EntityManagerCreator.getEntityManager();
        entityManager.getTransaction().begin();

       /* Pesel pesel = new Pesel("1232131");
        Human human = new Human("Michal", "Olszewski", pesel);
        entityManager.persist(human);*/

        Pesel pesel = entityManager.find(Pesel.class, 3l);
        System.out.println(pesel.getHuman());

        entityManager.getTransaction().commit();
    }
}
