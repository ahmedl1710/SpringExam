package tn.esprit.gestioncours1.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestioncours1.Repository.UtilisateurRepository;
import tn.esprit.gestioncours1.entities.Classe;
import tn.esprit.gestioncours1.entities.Utilisateur;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceUtilisateurImpl implements IServiceUtilisateur{



        private UtilisateurRepository utilisateurRepository;
    @Override
    public Utilisateur ajouterUtilisateur(Utilisateur u) {
        return utilisateurRepository.save(u);
    }

    @Override
    public Utilisateur midifierUtilisateur(Utilisateur u) {
        Utilisateur user= utilisateurRepository.findById(u.getIdUtilisateur()).orElse(null);
        user.setClasse(u.getClasse());
        user.setNom(u.getNom());
        user.setPassword(u.getPassword());
        user.setPrenom(u.getPrenom());
        return utilisateurRepository.save(user);
    }

    @Override
    public List<Utilisateur> retrieveUsers() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur retrieveUser(int id) {
        return utilisateurRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUser(int id) {
        utilisateurRepository.deleteById(id);
    }
}
