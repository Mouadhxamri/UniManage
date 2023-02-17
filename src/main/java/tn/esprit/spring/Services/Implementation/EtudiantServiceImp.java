package tn.esprit.spring.Services.Implementation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.Repositories.EtudiantRepository;
import tn.esprit.spring.Services.Interfaces.IEtudiantService;
import tn.esprit.spring.entities.Etudiant;

import java.util.List;

@Service
@Slf4j
public class EtudiantServiceImp  implements IEtudiantService {

    @Autowired
    EtudiantRepository etudiantRepository ;


    @Override
    public Long AjouterEtudiant(Etudiant E) {
        etudiantRepository.save(E) ;
        log.info("ajouter etudiant");
        return E.getIdEtudiant();
    }

     public List<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }

    public Etudiant getEtudiantsByIdEtudiant(Long id) {
        return etudiantRepository.findById(id).get();
    }

    @Override
    public Etudiant getEtudiantsByNameEtudiant(String name) {
        return etudiantRepository.findByNomE(name);
    }

    @Override
    public Long deleteEtudiant(Etudiant E) {
        etudiantRepository.delete(E);
        return E.getIdEtudiant();
    }

    @Override
    public Long updateEtudiant(Etudiant E) {
        etudiantRepository.saveAndFlush(E);
        return E.getIdEtudiant();
    }
}
