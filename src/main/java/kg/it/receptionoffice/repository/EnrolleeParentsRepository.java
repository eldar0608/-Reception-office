package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.EnrolleeParents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrolleeParentsRepository extends JpaRepository<EnrolleeParents, Integer> {
}
