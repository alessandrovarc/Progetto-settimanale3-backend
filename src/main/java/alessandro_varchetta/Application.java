package alessandro_varchetta;

import alessandro_varchetta.ArchivioDao.ArchivioDAO;
import alessandro_varchetta.entities.Libro;
import alessandro_varchetta.entities.Periodicita;
import alessandro_varchetta.entities.Rivista;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("progetto_settimanale3_backend");


    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        System.out.println("helloworld");//prova per vedere se funziona la tabella
        ArchivioDAO ad = new ArchivioDAO(em);

        Libro book1 = new Libro("Percy Jackson e il ladro di fulmini", 2010, 1000, "R. Riordan", "Fantasy");
        Libro book2 = new Libro("Le Cronache di Narnia", 1950, 1500, "C. S. Lewis", "Fantasy");

        Rivista rivista1 = new Rivista("Vogue", 2024, 50, Periodicita.MENSILE);
        Rivista rivista2 = new Rivista("La Gazzetta", 2000, 40, Periodicita.MENSILE);


        /*ad.addElemento(book1);
        ad.addElemento(book2);*/
        /*ad.addElemento(rivista1);
        ad.addElemento(rivista2);*/
    }

}
