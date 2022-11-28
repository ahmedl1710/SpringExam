package tn.esprit.gestioncours1.Service;

import tn.esprit.gestioncours1.entities.Classe;

import java.util.List;
import java.util.Set;

public interface IServiceClasse {

     Classe ajouterClasse(Classe c);
     Classe modifierClasse(Classe c);
     List<Classe> retriveClasse();
     Classe retieveClasseById(int id);
     void deleteClasse(int id);



}
