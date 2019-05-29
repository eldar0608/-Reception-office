package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Integer, User> {

}
