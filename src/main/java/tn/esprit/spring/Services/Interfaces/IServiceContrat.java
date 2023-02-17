package tn.esprit.spring.Services.Interfaces;

import tn.esprit.spring.entities.Contrat;

import java.util.List;

public interface IServiceContrat {
    public Long AjouterContrat(Contrat C);
    public List<Contrat> getAllContracts() ;
    public void deleteContrat(Contrat C) ;
    public void updateContrat(Contrat C) ;


}
