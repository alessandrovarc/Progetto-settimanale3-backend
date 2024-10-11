package alessandro_varchetta.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "elemento")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Elemento {

    @Id
    @GeneratedValue
    protected long code_isbn;
    protected String titolo;
    protected int anno_pubblicazione;
    protected int numero_pagine;

    public Elemento () {};
    //ci creamo il costrutto vuoto per permettere a hibernate di creare una tabella senza crearti un oggetto


    public Elemento(String titolo, int anno_pubblicazione, int numero_pagine) {
        this.titolo = titolo;
        this.anno_pubblicazione = anno_pubblicazione;
        this.numero_pagine = numero_pagine;
    }

    public long getCode_isbn() {
        return code_isbn;
    }

    public void setCode_isbn(long code_isbn) {
        this.code_isbn = code_isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnno_pubblicazione() {
        return anno_pubblicazione;
    }

    public void setAnno_pubblicazione(int anno_pubblicazione) {
        this.anno_pubblicazione = anno_pubblicazione;
    }

    public int getNumero_pagine() {
        return numero_pagine;
    }

    public void setNumero_pagine(int numero_pagine) {
        this.numero_pagine = numero_pagine;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "code_isbn=" + code_isbn +
                ", titolo='" + titolo + '\'' +
                ", anno_pubblicazione=" + anno_pubblicazione +
                ", numero_pagine=" + numero_pagine +
                '}';
    }
}