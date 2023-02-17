package tn.esprit.spring.Services.Interfaces;


import tn.esprit.spring.entities.Departement;

import java.util.List;

public interface IDepartement {
    public Long AjouterDepartement(Departement D) ;
    public List<Departement> getAllD();

            void update (Departement D);
    void delete (Departement D);
}
