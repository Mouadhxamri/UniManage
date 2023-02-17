package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Universite;

import java.util.List;

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
    //Universite  findById_univ(Long id) ;
    //List<Universite>  findAllByDepartements(Departement d) ;
}
