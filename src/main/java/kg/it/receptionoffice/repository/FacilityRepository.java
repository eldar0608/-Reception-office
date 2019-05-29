package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityRepository extends JpaRepository<Integer, Facility> {
}
