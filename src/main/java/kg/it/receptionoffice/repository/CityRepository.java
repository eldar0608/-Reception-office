package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.Citizenship;
import kg.it.receptionoffice.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CityRepository extends JpaRepository<City, Integer> {
}
