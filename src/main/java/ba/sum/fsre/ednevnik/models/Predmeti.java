package ba.sum.fsre.ednevnik.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Predmeti {

    public Predmeti(long id, String ime_predmeta, String ime_profesora){
        this.id = id;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIme_predmeta() {
        return Ime_predmeta;
    }

    public void setIme_predmeta(String ime_predmeta) {
        Ime_predmeta = ime_predmeta;
    }

    public String getIme_profesora() {
        return Ime_profesora;
    }

    public void setIme_profesora(String ime_profesora) {
        Ime_profesora = ime_profesora;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private Long id;

    @Column(name = "Ime_predmeta")
    private String Ime_predmeta;

    @Column(name = "Ime_profesora")
    private String Ime_profesora;
}