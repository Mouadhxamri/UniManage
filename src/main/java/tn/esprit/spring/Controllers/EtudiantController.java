package tn.esprit.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Services.Interfaces.IEtudiantService;
import tn.esprit.spring.entities.Etudiant;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;

@Tag(name = "Student Management")
@RestController
@RequestMapping("/EtudiantController")
public class EtudiantController {

    @Autowired
    IEtudiantService etudiantService ;
    @GetMapping("/")
    public String sayHello() {
        return "Hello world" ;
    }
    @Operation(description = "Add Student")
    @PostMapping("/addEtudiant")
    @ResponseBody
    public void addEtudiant(@RequestBody Etudiant etudiant) {
        etudiantService.AjouterEtudiant(etudiant);

    }
    @Operation(description = "Get all students")
    @GetMapping(value = "/etudiants")
    @ResponseBody
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiant() ;
    }


    @Operation (description = "Update Student")
    @PutMapping("/updateEtudiant")
    @ResponseBody
    public void updateEtudiant(@RequestBody Etudiant e){
        etudiantService.updateEtudiant(e);
    }

    @Operation(description = "deleteStudent")
    @DeleteMapping("/deleteEtudiant")
    @ResponseBody
    public void deleteStudent (@RequestBody Etudiant e){
        etudiantService.deleteEtudiant(e);
    }

}
