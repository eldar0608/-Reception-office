package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.Rayon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RayonRepository extends JpaRepository<Rayon, Integer> {
}
