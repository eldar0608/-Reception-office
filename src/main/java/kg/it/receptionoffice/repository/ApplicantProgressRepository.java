package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.ApplicantProgress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantProgressRepository extends JpaRepository<ApplicantProgress, Integer> {
}
