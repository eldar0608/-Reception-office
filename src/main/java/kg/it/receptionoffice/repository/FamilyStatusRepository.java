package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.FamilyStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyStatusRepository extends JpaRepository<Integer, FamilyStatus> {
}
