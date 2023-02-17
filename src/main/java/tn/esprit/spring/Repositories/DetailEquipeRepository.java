package tn.esprit.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entities.DetailEquipe;
import tn.esprit.spring.entities.Equipe;

import java.util.List;

public interface DetailEquipeRepository extends JpaRepository<DetailEquipe,Long> {
    DetailEquipe findDetailEquipeByIdDetailEquipe(Long id) ;
     //List<DetailEquipe> findByIdDetailEquipeAndAndEquipe(Long id , Equipe e ) ;
}
