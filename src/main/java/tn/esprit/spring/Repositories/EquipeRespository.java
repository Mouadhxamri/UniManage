package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Equipe;

import java.util.List;
@Repository
public interface EquipeRespository  extends JpaRepository<Equipe, Long > {
    Equipe findByIdEquipe(Long idEquipe) ;
    List<Equipe> findEquipeByIdEquipeIsGreaterThan( Long id) ;

}
