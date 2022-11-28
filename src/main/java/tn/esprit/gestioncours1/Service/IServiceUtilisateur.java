package tn.esprit.gestioncours1.Service;

import tn.esprit.gestioncours1.Repository.UtilisateurRepository;
import tn.esprit.gestioncours1.entities.Utilisateur;

import java.util.List;

public interface IServiceUtilisateur {

        Utilisateur ajouterUtilisateur(Utilisateur u);
        Utilisateur midifierUtilisateur(Utilisateur u);
        List<Utilisateur> retrieveUsers();
        Utilisateur retrieveUser(int id);
        void deleteUser(int id);
}
