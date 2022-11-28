package tn.esprit.gestioncours1.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString

public class CoursClassroom {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)//car on ne peut pas modifier les id
    Integer IdCkours;
    Specialite specialite;
    String Nom;
    Integer nbHeures;

    @JsonIgnore
    @ManyToOne
    Classe classe;

}
