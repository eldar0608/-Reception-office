package kg.it.receptionoffice.repository;

import kg.it.receptionoffice.model.Citizenship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CitizenshipRepository extends JpaRepository<Citizenship, Integer> {
    @Override
    List<Citizenship> findAll();

    @Override
    Citizenship save(Citizenship citizenship);

    @Override
    void delete(Citizenship citizenship);

}
