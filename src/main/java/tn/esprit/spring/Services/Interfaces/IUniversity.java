package tn.esprit.spring.Services.Interfaces;


import tn.esprit.spring.entities.Universite;

import java.util.List;

public interface IUniversity {
    public Long AjoutUniversity(Universite C);
    public List<Universite> getAllUniversities() ;

    public void update (Universite C);
    public void delete (Universite C);

}
