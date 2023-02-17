package tn.esprit.spring.Controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Services.Interfaces.IUniversity;
import tn.esprit.spring.entities.Etudiant;
import tn.esprit.spring.entities.Universite;

import java.util.List;

@Tag(name = "University Management")
@RestController
@RequestMapping("/University")
public class UniversiteController {

    @Autowired
    IUniversity iUniversity ;


    @Operation(description = "Add Universite")
    @PostMapping(value = "/addUniversité")
    @ResponseBody
    public void  addUniversity(   @RequestBody Universite u) {
        iUniversity.AjoutUniversity(u);
    }

    @Operation(description = "Get University")
    @GetMapping(value = "/getUni")
    @ResponseBody
    public List<Universite> getAllUniversites() {
        return iUniversity.getAllUniversities();
    }

    @Operation(description = "Update University")
    @PutMapping("/updateUni")
    @ResponseBody
    public void updateEtudiant(@RequestBody Universite e){
        iUniversity.update(e);
    }

    @Operation(description = "deleteStudent")
    @DeleteMapping("/deleteUni")
    @ResponseBody
    public void deleteStudent (@RequestBody Universite e){
        iUniversity.update(e);
    }




}
