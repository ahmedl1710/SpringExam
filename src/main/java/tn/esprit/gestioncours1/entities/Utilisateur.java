package tn.esprit.gestioncours1.entities;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Utilisateur implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)//car on ne peut pas modifier les id
    Integer IdUtilisateur;
    String nom;
    String prenom;
    String password;

    @ManyToOne(cascade = CascadeType.ALL)
    Classe classe;


}
