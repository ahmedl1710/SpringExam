package tn.esprit.gestioncours1.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestioncours1.Repository.CoursClassroomRepository;
import tn.esprit.gestioncours1.entities.CoursClassroom;

import java.util.List;


@Service
@AllArgsConstructor
public class ServiceCoursClassroomImpl implements IServiceCoursClassroom{

    private CoursClassroomRepository coursClassroomRepository;


    @Override
    public CoursClassroom ajouterCoursClassroom(CoursClassroom cc) {
        return coursClassroomRepository.save(cc);
    }

    @Override
    public CoursClassroom modifierCoursClassroom(CoursClassroom cc) {
        CoursClassroom cour= coursClassroomRepository.findById(cc.getIdCkours()).orElse(null);
        cour.setNom(cc.getNom());
        cour.setClasse(cc.getClasse());
        cour.setNbHeures(cc.getNbHeures());
        cour.setSpecialite(cc.getSpecialite());
        return coursClassroomRepository.save(cour);
    }

    @Override
    public List<CoursClassroom> retrieveCoursClassroom() {
        return coursClassroomRepository.findAll();
    }

    @Override
    public CoursClassroom retiriveCour(int id) {
        return coursClassroomRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteCoursClassroom(int id) {
        coursClassroomRepository.deleteById(id);
    }
}
