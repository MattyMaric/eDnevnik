package ba.sum.fsre.ednevnik.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ocjena")
public class Ocjena {

    @Id
    @GeneratedValue
    private Long id;
    private int ocjena;
    private String datum;
    private long Predmet_ID;
    private long Ucenik_ID;

    public Ocjena(long id, int ocjena, String datum, long Predmet_ID, long Ucenik_ID){
    this.id = id;
    this.ocjena = ocjena;
    this.Predmet_ID = Predmet_ID;
    this.Ucenik_ID = Ucenik_ID;
}

    public Ocjena() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    public int getOcjena() {
        return ocjena;
    }

    public void setOcjena(int ocjena) {
        this.ocjena = ocjena;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public long getPredmet_ID() {
        return Predmet_ID;
    }

    public void setPredmet_ID(long predmet_ID) {
        Predmet_ID = predmet_ID;
    }

    public long getUcenik_ID() {
        return Ucenik_ID;
    }

    public void setUcenik_ID(long ucenik_ID) {
        Ucenik_ID = ucenik_ID;
    }
}
