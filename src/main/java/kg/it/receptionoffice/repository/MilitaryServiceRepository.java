package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.MilitaryService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MilitaryServiceRepository extends JpaRepository<MilitaryService, Integer> {
}
