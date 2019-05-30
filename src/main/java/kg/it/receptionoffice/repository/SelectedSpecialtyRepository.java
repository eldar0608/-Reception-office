package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.SelectedSpecialty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SelectedSpecialtyRepository extends JpaRepository<SelectedSpecialty, Integer> {
}
