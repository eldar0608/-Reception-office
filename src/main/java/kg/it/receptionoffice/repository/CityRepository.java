package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.Citizenship;
import kg.it.receptionoffice.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Integer> {
    @Override
    List<City> findAll();

    @Override
    City save(City city);

    @Override
    void delete(City city);
}
