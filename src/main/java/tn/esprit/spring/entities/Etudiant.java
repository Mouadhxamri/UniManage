package tn.esprit.spring.entities;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
 //@AllArgsConstructor /*   genere un constrcuteur avec tout les attruibiute */
//@RequiredArgsConstructor  /*   genere un constructor avec tout les attributs   non null */
@ToString
@Data
 public class Etudiant implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
    @Enumerated(EnumType.STRING)
    private Option opt ;


    @OneToMany(cascade = CascadeType.ALL, mappedBy="etudiant")
    private Set<Contrat> contrats ;
    @ManyToMany
    private Set<Equipe> equipes ;

    @ManyToOne
    private Departement departements ;




}