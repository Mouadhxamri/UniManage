package tn.esprit.spring.Services.Implementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Repositories.DepartementRepository;
import tn.esprit.spring.Services.Interfaces.IDepartement;
import tn.esprit.spring.entities.Departement;

import java.util.List;
@Service
@Slf4j
public class DepartementService implements IDepartement {

@Autowired
DepartementRepository departementRepository ;


    @Override
    public Long AjouterDepartement(Departement D) {
        departementRepository.save(D);
        log.info("ajouter equipe");
        return D.getIdDepartement();

     }

    @Override
    public List<Departement> getAllD() {
        return departementRepository.findAll();
    }

    @Override
    public void update(Departement D) {
        departementRepository.save(D);
    }

    @Override
    public void delete(Departement D) {
    departementRepository.delete(D);
    }


}
