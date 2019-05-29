package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Integer, Country> {
}
