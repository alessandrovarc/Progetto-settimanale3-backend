package alessandro_varchetta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;


@Entity
@Table(name = "utente")
public class Utente {

    @Id
    @GeneratedValue
    private long numero_tessera;
    private String nome;
    private String cognome;
    private LocalDate anno_nascita;

    public Utente() {};

    public Utente(String nome, LocalDate anno_nascita, String cognome) {
        this.nome = nome;
        this.anno_nascita = anno_nascita;
        this.cognome = cognome;
    }

    public long getNumero_tessera() {
        return numero_tessera;
    }

    public void setNumero_tessera(long numero_tessera) {
        this.numero_tessera = numero_tessera;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getAnno_nascita() {
        return anno_nascita;
    }

    public void setAnno_nascita(LocalDate anno_nascita) {
        this.anno_nascita = anno_nascita;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "numero_tessera=" + numero_tessera +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", anno_nascita=" + anno_nascita +
                '}';
    }
}
