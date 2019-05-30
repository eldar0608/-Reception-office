package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.Citizenship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitizenshipRepository extends JpaRepository<Citizenship, Integer> {
}
