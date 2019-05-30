package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepository extends JpaRepository<Speciality,Integer> {
}
