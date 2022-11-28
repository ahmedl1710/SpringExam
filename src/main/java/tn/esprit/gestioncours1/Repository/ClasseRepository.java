package tn.esprit.gestioncours1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestioncours1.entities.Classe;

public interface ClasseRepository extends JpaRepository<Classe,Integer> {
}
