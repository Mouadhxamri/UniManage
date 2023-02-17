package tn.esprit.spring.Services.Interfaces;


import tn.esprit.spring.entities.DetailEquipe;

import java.util.List;

public interface IDetailEquipe {
    public Long AjouterDetailEquipe(DetailEquipe D) ;
    public List<DetailEquipe> getAllDE();
    public  void update (DetailEquipe D);
    public  void delete (DetailEquipe D);
}
