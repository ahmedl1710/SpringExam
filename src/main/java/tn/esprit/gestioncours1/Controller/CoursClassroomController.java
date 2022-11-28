package tn.esprit.gestioncours1.Controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestioncours1.Service.ServiceCoursClassroomImpl;
import tn.esprit.gestioncours1.entities.CoursClassroom;

import java.util.List;

@RestController
@AllArgsConstructor
public class CoursClassroomController {

    private ServiceCoursClassroomImpl serviceCours;


    @PostMapping("/addCours")
    public CoursClassroom AddCours(@RequestBody CoursClassroom cc)
    {
        return serviceCours.ajouterCoursClassroom(cc);
    }
    @PutMapping("/updateCours")
    public CoursClassroom UpdateCours(@RequestBody CoursClassroom cc)
    {
        return serviceCours.modifierCoursClassroom(cc);
    }
    @GetMapping("/Courses")
    public List<CoursClassroom> ReadCourses()
    {
        return serviceCours.retrieveCoursClassroom();
    }
    @GetMapping("/Course/{id}")
    public CoursClassroom ReadCourse(@PathVariable int id)
    {
        return serviceCours.retiriveCour(id);
    }
    @DeleteMapping("/deleteCours/{id}")
    public void DeleteCourse(@PathVariable int id)
    {
         serviceCours.deleteCoursClassroom(id);
    }
}
