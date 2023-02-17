package tn.esprit.spring.Services.Interfaces;

import tn.esprit.spring.Repositories.EtudiantRepository;
import tn.esprit.spring.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    public Long AjouterEtudiant(Etudiant E) ;
    public List<Etudiant> getAllEtudiant() ;
    public Etudiant getEtudiantsByIdEtudiant(Long id);
    public Etudiant getEtudiantsByNameEtudiant(String name);
    public Long deleteEtudiant(Etudiant E);
    public Long updateEtudiant(Etudiant E);
}
