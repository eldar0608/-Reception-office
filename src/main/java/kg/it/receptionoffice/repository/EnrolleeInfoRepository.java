package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.EnrolleeInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrolleeInfoRepository extends JpaRepository<EnrolleeInfo, Integer> {
}
