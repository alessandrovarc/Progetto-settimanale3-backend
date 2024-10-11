package alessandro_varchetta.ArchivioDao;

import alessandro_varchetta.entities.Elemento;
import alessandro_varchetta.entities.Prestito;
import alessandro_varchetta.entities.Utente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class ArchivioDAO {
    private final EntityManager entityManager;

    public ArchivioDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void addElemento (Elemento newElement) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newElement);
        transaction.commit();
        System.out.println("l'elemento" + newElement.getTitolo() + "è stato aggiunto con successo");
    }

    public void addUtente (Utente newUtente) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newUtente);
        transaction.commit();
        System.out.println("l'utente" + newUtente.getNome() + "è stato aggiunto con successo");
    }
    public void addPrestito (Prestito newPrestito) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newPrestito);
        transaction.commit();
        System.out.println("elemento aggiunto" + newPrestito.getId());
    }
    public Elemento getsByISBN () {

        return null;
    };

    public void rimuovereElementoByISBN  (long ISBN) {

    };
}
