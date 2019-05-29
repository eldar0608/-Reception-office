package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.Citizenship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenshipRepository extends JpaRepository<Integer, Citizenship> {
}
