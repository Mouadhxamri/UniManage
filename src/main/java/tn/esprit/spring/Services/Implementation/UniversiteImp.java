package tn.esprit.spring.Services.Implementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Services.Interfaces.IUniversity;
import tn.esprit.spring.Repositories.UniversiteRepository;
import tn.esprit.spring.entities.Universite;

import java.util.List;
@Service
@Slf4j
public class UniversiteImp implements IUniversity {


    @Autowired
    UniversiteRepository universiteRepository ;


    @Override
    public Long AjoutUniversity(Universite u) {
        universiteRepository.save(u);
        log.info("university added ");
        return u.getIdUniv();

    }

    @Override
    public List<Universite> getAllUniversities() {
        return universiteRepository.findAll();
    }

    @Override
    public void update(Universite C) {
        universiteRepository.save(C);
    }

    @Override
    public void delete(Universite C) {
        universiteRepository.delete(C);
    }
}
