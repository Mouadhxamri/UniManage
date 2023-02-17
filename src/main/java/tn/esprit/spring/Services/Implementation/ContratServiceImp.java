package tn.esprit.spring.Services.Implementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Repositories.ContratRepository;
import tn.esprit.spring.Services.Interfaces.IServiceContrat;
import tn.esprit.spring.entities.Contrat;

import java.util.List;

@Service
@Slf4j
public class ContratServiceImp implements IServiceContrat {

    @Autowired
    ContratRepository contratRepository ;



    @Override
    public Long AjouterContrat(Contrat C) {
        contratRepository.save(C) ;
        log.info("ajouter contrat");
        return C.getIdContrat() ;
    }

    @Override
    public List<Contrat> getAllContracts() {
        return contratRepository.findAll();
    }

    @Override
    public void deleteContrat(Contrat C) {
        if(contratRepository.findAll().contains(C)) {
            contratRepository.delete(C);


        }

     }



    @Override
    public void updateContrat(Contrat C) {

        contratRepository.saveAndFlush(C);

    }




}
