package tn.esprit.gestioncours1.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestioncours1.Service.ServiceUtilisateurImpl;
import tn.esprit.gestioncours1.entities.Utilisateur;

import java.util.List;

@RestController
@AllArgsConstructor
public class UtilisateurController {

    private ServiceUtilisateurImpl serviceUtilisateur;

    @PostMapping("/AjouterUtilisateur")
    public Utilisateur AddUser(@RequestBody Utilisateur u)
    {
        return serviceUtilisateur.ajouterUtilisateur(u);
    }


    @PutMapping("/UpdateUtilisateur")
    public Utilisateur UpdateUser(@RequestBody Utilisateur u)
    {
        return serviceUtilisateur.midifierUtilisateur(u);
    }

    @GetMapping("/Utilisateurs")
    public List<Utilisateur> ReadUtilisateurs()
    {
        return serviceUtilisateur.retrieveUsers();
    }
    @GetMapping("/Utilisateur/{id}")
    public Utilisateur ReadUtilisateur(@PathVariable int id)
    {
        return serviceUtilisateur.retrieveUser(id);
    }
    @DeleteMapping("/deleteUser/{id}")
    public void deleteUtilisateur(@PathVariable int id)
    {
         serviceUtilisateur.deleteUser(id);
    }
}
