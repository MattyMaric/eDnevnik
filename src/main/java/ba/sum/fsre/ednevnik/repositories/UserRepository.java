package ba.sum.fsre.ednevnik.repositories;

import ba.sum.fsre.ednevnik.models.users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<users, Long> {
}
