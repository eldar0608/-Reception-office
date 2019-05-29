package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Integer, Region> {
}
