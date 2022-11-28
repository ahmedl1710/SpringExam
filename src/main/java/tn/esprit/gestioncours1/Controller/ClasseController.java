package tn.esprit.gestioncours1.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestioncours1.Service.ServiceClasseImpl;
import tn.esprit.gestioncours1.entities.Classe;

import java.util.List;


@RestController
@AllArgsConstructor
public class ClasseController {

    private ServiceClasseImpl serviceClasse;

    @PostMapping("/addClasse")
    public Classe AddClasse(@RequestBody Classe c)
    {
        return serviceClasse.ajouterClasse(c);
    }

    @PutMapping("/modifyClasse")
    public Classe UpdateClasse(@RequestBody Classe c)
    {
        return serviceClasse.modifierClasse(c);
    }
    @GetMapping("/Classes")
    public List<Classe> RetrieveClasses()
    {
        return serviceClasse.retriveClasse();
    }
    @GetMapping("/Classe/{id}")
    public Classe RetriveClasse(@PathVariable int id)
    {
        return serviceClasse.retieveClasseById(id);
    }

    @DeleteMapping("/deleteClasse/{id}")
    public void deleteClasse(@PathVariable int id)
    {
        serviceClasse.deleteClasse(id);
    }
}
