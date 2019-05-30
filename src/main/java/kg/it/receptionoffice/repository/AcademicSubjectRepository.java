package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.AcademicSubject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicSubjectRepository extends JpaRepository<AcademicSubject, Integer> {
}
