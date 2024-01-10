package ba.sum.fsre.ednevnik.repositories;

import ba.sum.fsre.ednevnik.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT DISTINCT k FROM User k  WHERE k.Email=?1")
    public User findByEmail(String email);

}
