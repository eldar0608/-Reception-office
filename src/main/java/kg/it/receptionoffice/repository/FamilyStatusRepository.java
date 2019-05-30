package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.FamilyStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyStatusRepository extends JpaRepository<FamilyStatus, Integer> {
}
