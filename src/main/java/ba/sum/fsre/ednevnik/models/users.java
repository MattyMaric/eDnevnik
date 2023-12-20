package ba.sum.fsre.ednevnik.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.*;

//Ja

@Entity
public class users {

    @Id
    @GeneratedValue

    private Long id;

    @NotBlank(message = "Ime je obvezno")
    @Size(min = 5, max = 20, message = "Polje mora imati izmedu 5 i 20 znakova")
    String ime;

    @NotBlank(message = "Prezime je obvezno")
    @Size(min = 5, max = 20, message = "Polje mora imati izmedu 5 i 20 znakova")
    String Prezime;

    @NotBlank(message = "Prezime je obvezno")
    @Email(message = "Email mora biti ispravnog formata")
    String Email;

    @NotBlank(message = "Molimo unesite lozinku!")
    String lozinka;
    @NotBlank(message = "Molimo ponovo unesite lozinku!")
    @Transient
    String potvrdaLozinke;

    public users() {

    }


    public users(long id, String ime, String prezime, String email, String lozinka, String potvrdaLozinke) {
        this.id = id;
        this.ime = ime;
        this.Prezime = prezime;
        this.Email = email;
        this.potvrdaLozinke = potvrdaLozinke;
        this.lozinka = lozinka;
    }

   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

     public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getPotvrdaLozinke() {
        return potvrdaLozinke;
    }

    public void setPotvrdaLozinke(String potvrdaLozinke) {
        this.potvrdaLozinke = potvrdaLozinke;
    }

    @AssertTrue(message = "Lozinke se moraju podudarati")
    public boolean isPasswordsEqual() {
        try {
            return this.lozinka.equals(this.potvrdaLozinke);
        } catch (Exception e) {
            return false;
        }
    }
}
