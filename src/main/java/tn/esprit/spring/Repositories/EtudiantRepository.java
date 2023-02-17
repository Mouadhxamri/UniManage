package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Etudiant;

import java.util.List;

@Repository
public interface EtudiantRepository  extends JpaRepository<Etudiant , Long > {
    Etudiant  findAllByIdEtudiant(Long id) ;
    List<Etudiant>  findAllByContrats(Contrat contrat) ;
    Etudiant findByNomE(String name);


}
