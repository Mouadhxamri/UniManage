package tn.esprit.spring.Services.Interfaces;

import tn.esprit.spring.entities.Equipe;

import java.util.List;

public interface IEquipeService {
    public Long AjouterEquipe(Equipe E) ;
    public List<Equipe> getAllEquipe() ;

    public void update (Equipe E);
    public void delete (Equipe E);

}
