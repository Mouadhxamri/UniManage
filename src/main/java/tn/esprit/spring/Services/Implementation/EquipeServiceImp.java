package tn.esprit.spring.Services.Implementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Repositories.EquipeRespository;
import tn.esprit.spring.Services.Interfaces.IEquipeService;
import tn.esprit.spring.entities.Equipe;

import java.util.List;
@Service
@Slf4j
public class EquipeServiceImp implements IEquipeService {


    @Autowired
    EquipeRespository equipeRespository ;



    @Override
    public Long AjouterEquipe(Equipe E) {

        equipeRespository.save(E) ;
        log.info("ajouter equipe");
        return E.getIdEquipe();





    }

    @Override
    public List<Equipe> getAllEquipe() {
        return equipeRespository.findAll();
    }

    @Override
    public void update(Equipe E) {
     equipeRespository.save(E);
    }

    @Override
    public void delete(Equipe E) {
  equipeRespository.delete(E);
    }
}
