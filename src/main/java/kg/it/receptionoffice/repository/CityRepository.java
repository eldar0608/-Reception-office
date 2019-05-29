package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<Integer, City> {
}
