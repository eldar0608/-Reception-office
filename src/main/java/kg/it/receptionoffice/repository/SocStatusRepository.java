package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.SocStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocStatusRepository extends JpaRepository<SocStatus, Integer> {

}
