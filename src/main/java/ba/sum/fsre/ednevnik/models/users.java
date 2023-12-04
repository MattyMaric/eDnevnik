package ba.sum.fsre.ednevnik.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class users {
    public users(long id, String ime, String prezime, String email) {
        this.id = id;
        this.ime = ime;
        this.Prezime = prezime;
        this.email = email;
    }

    @Id
    @GeneratedValue

    private long id;
    private String ime;
    private String Prezime;

    public users() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return Prezime;
    }

    public void setPrezime(String prezime) {
        Prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email;

}
