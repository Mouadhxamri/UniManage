package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Contrat;

import java.util.List;

@Repository
public interface ContratRepository  extends JpaRepository<Contrat, Long > {
    Contrat findByIdContrat(Long id ) ;
     List<Contrat> findContratByArchive(String a ) ;
}
