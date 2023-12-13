package ba.sum.fsre.ednevnik.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class users {
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
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public users(long id, String ime, String prezime, String email) {
        this.id = id;
        this.ime = ime;
        this.Prezime = prezime;
        this.Email = email;
    }

    @Id
    @GeneratedValue

    private long id;

    @NotBlank(message="Ime je obvezno")
    @Size(min=5, max=20, message = "Polje mora imati izmedu 5 i 20 znakova")
    private String ime;

    @NotBlank(message="Prezime je obvezno")
    @Size(min=5, max=20, message = "Polje mora imati izmedu 5 i 20 znakova")
    private String Prezime;

    @NotBlank(message = "Prezime je obvezno")
    @Email(message = "Email mora biti ispravnog formata")
    private String Email;

    public users() {

    }



}
