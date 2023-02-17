package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Etudiant;

import java.util.List;

@Repository
public interface DepartementRepository extends JpaRepository<Departement,Long> {
    //Departement findAllByIdDepartement(Long id ) ;
    //List<Departement>  findDepartementByEtudiantsExists(Etudiant E) ;
}

