package kg.it.receptionoffice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantProgressRepository extends JpaRepository<ApplicantProgressRepository, Integer> {
}
