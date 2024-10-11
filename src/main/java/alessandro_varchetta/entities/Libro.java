package alessandro_varchetta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "libri")
public class Libro extends Elemento {

    private String autore;
    private String genere;

    public Libro () {};

    public Libro(String titolo, int anno_pubblicazione, int numero_pagine, String autore, String genere) {
        super(titolo, anno_pubblicazione, numero_pagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                ", numero_pagine=" + numero_pagine +
                ", anno_pubblicazione=" + anno_pubblicazione +
                ", titolo='" + titolo + '\'' +
                ", code_isbn=" + code_isbn +
                '}';
    }
}