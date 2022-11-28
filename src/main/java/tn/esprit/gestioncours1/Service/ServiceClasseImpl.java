package tn.esprit.gestioncours1.Service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestioncours1.Repository.ClasseRepository;
import tn.esprit.gestioncours1.entities.Classe;

import java.util.List;
import java.util.Set;


@Service
@AllArgsConstructor
public class ServiceClasseImpl implements IServiceClasse{

    @Autowired
    public ClasseRepository classeRepository;

    @Override
    public Classe ajouterClasse(Classe c) {
        return classeRepository.save(c);
    }

    @Override
    public Classe modifierClasse(Classe c) {
        Classe c2=classeRepository.findById(c.getCodeClasse()).orElse(null);
        c2.setTitle(c.getTitle());
        c2.setNiveau(c.getNiveau());

        return classeRepository.save(c2);
    }

    @Override
    public List<Classe> retriveClasse() {
        return classeRepository.findAll();
    }

    @Override
    public Classe retieveClasseById(int id) {
        return classeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteClasse(int id) {
        classeRepository.deleteById(id);
    }
}
