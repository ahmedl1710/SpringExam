package tn.esprit.gestioncours1.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)//car on ne peut pas modifier les id
    Integer codeClasse;
    String title;
    Niveau niveau;


    @JsonIgnore
    @OneToMany(mappedBy = "classe")
    Set<CoursClassroom> cc=new HashSet<>();
    //juste pour initialiser la liste
    //(lors de l ajout d'un objet il trouve une liste existante)


}
