package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.City;
import kg.it.receptionoffice.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
    @Override
    List<Country> findAll();

    @Override
    City save(Country country);

    @Override
    void delete(Country country);
}
