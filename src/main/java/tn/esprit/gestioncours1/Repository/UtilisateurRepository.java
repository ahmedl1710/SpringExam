package tn.esprit.gestioncours1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestioncours1.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
}
