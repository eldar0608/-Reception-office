package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Integer, Role> {
}