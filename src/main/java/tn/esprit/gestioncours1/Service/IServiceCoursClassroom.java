package tn.esprit.gestioncours1.Service;

import tn.esprit.gestioncours1.entities.CoursClassroom;

import java.util.List;

public interface IServiceCoursClassroom {

    CoursClassroom ajouterCoursClassroom(CoursClassroom cc);
    CoursClassroom modifierCoursClassroom(CoursClassroom cc);
    List<CoursClassroom> retrieveCoursClassroom();
    CoursClassroom retiriveCour(int id);
    void deleteCoursClassroom(int id);

}
