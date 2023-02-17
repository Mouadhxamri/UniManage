package tn.esprit.spring.Controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Services.Interfaces.IDepartement;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Etudiant;

import java.util.List;

@RestController
@Tag(name = "Department Management")
@RequestMapping("/Department")
public class DepartementController {

    @Autowired
    IDepartement DepartementService ;
    @Operation(description = "add Department")
    @PostMapping("/addDepartment")
    @ResponseBody
    public void addDepartement(@RequestBody Departement d) {
        DepartementService.AjouterDepartement(d) ;
    }

    @Operation(description = "get All Departments")
    @GetMapping(value = "/getDepartment")
    @ResponseBody
    public List<Departement> getAllDE() {
        return  DepartementService.getAllD();
    }

    @Operation(description = "Update Department")
    @PutMapping("/updateDepatment")
    @ResponseBody
    public void updateEtudiant(@RequestBody Departement e){
        DepartementService.update(e);
    }

    @Operation(description = "delete Department")
    @DeleteMapping("/deleteEtudiant")
    @ResponseBody
    public void deleteStudent (@RequestBody Departement e){
        DepartementService.delete(e);
    }

}
