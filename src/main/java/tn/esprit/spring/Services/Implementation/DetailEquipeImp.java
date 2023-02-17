package tn.esprit.spring.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Repositories.DetailEquipeRepository;
import tn.esprit.spring.Services.Interfaces.IDetailEquipe;
import tn.esprit.spring.entities.DetailEquipe;

import java.util.List;

@Service
public class DetailEquipeImp implements IDetailEquipe {


    @Autowired
    DetailEquipeRepository detailEquipeRepository ;

    @Override
    public Long AjouterDetailEquipe(DetailEquipe D) {
        detailEquipeRepository.save(D);
        return D.getIdDetailEquipe();
    }

    @Override
    public List<DetailEquipe> getAllDE() {
        return detailEquipeRepository.findAll();
    }

    @Override
    public void update(DetailEquipe D) {
        detailEquipeRepository.save(D);
    }

    @Override
    public void delete(DetailEquipe D) {
        detailEquipeRepository.delete(D);
    }
}
