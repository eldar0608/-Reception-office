package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.Testing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestingRepository extends JpaRepository<Testing, Integer> {
}