package alessandro_varchetta.entities;

import com.sun.jdi.LocalVariable;
import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name= "prestito")
public class Prestito {

    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name = "utente_id", nullable = false)//perchè l'utente può fare più prestiti ma non il contrario
    private Utente utente;
    @ManyToOne
    @JoinColumn(name = "elementi_prestati", nullable = false)
    private Elemento elemento_prestito;
    private LocalDate data_inizio;
    private LocalDate data_restituzione;
    @Column(nullable = false)
    private LocalDate data_res_effettiva;

    public Prestito(){}

    public Prestito(Utente utente, Elemento elemento_prestito, LocalDate data_inizio, LocalDate data_restituzione, LocalDate data_res_effettiva) {
        this.utente = utente;
        this.elemento_prestito = elemento_prestito;
        this.data_inizio = data_inizio;
        this.data_restituzione = data_restituzione.plusDays(30);
        this.data_res_effettiva = data_res_effettiva;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Elemento getElemento_prestito() {
        return elemento_prestito;
    }

    public void setElemento_prestito(Elemento elemento_prestito) {
        this.elemento_prestito = elemento_prestito;
    }

    public LocalDate getData_inizio() {
        return data_inizio;
    }

    public void setData_inizio(LocalDate data_inizio) {
        this.data_inizio = data_inizio;
    }

    public LocalDate getData_restituzione() {
        return data_restituzione;
    }

    public void setData_restituzione(LocalDate data_restituzione) {
        this.data_restituzione = data_restituzione;
    }

    public LocalDate getData_res_effettiva() {
        return data_res_effettiva;
    }

    public void setData_res_effettiva(LocalDate data_res_effettiva) {
        this.data_res_effettiva = data_res_effettiva;
    }

    @Override
    public String toString() {
        return "Prestito{" +
                "id=" + id +
                ", utente=" + utente +
                ", elemento_prestito=" + elemento_prestito +
                ", data_inizio=" + data_inizio +
                ", data_restituzione=" + data_restituzione +
                ", data_res_effettiva=" + data_res_effettiva +
                '}';
    }
}
