package tn.esprit.gestioncours1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestioncours1.entities.CoursClassroom;

public interface CoursClassroomRepository extends JpaRepository<CoursClassroom,Integer> {
}
