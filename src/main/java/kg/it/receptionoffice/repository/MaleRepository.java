package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.Male;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaleRepository extends JpaRepository<Male,Integer> {
}
