package kg.it.receptionoffice.service;

import kg.it.receptionoffice.model.Citizenship;
import kg.it.receptionoffice.repository.CitizenshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenshipService {

    private final CitizenshipRepository citizenshipRepository;

@Autowired
    public CitizenshipService(CitizenshipRepository citizenshipRepository) {
        this.citizenshipRepository = citizenshipRepository;
    }

    public List<Citizenship> getAllCitizenship(){
        return citizenshipRepository.findAll();
    }

    public Citizenship updateCitizenship(Citizenship citizenship, Integer id)
    {
        citizenship.setId(id);
        return citizenshipRepository.save(citizenship);
    }


    public void deleteCityzenship(Integer id){
        citizenshipRepository.delete(citizenshipRepository.findById(id).get());

    }

    public Citizenship saveCitizenship(Citizenship citizenship){
        return citizenshipRepository.save(citizenship);
    }

}
