package tn.esprit.spring.Controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Services.Interfaces.IEquipeService;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Equipe;

import java.util.List;

@Tag(name = "Team Management")
@RestController
@RequestMapping("/Equipes")
public class EquipeController {
    @Autowired
    IEquipeService equipeService;
/*
    @PostMapping("/add")
    @ResponseBody
    public void addEquipe(@RequestBody Equipe E ) {
        System.out.println(E);
         equipeService.AjouterEquipe(E) ;

    }
    */

    @GetMapping("/")
    public String sayHello() {
        return "Hello world" ;
    }

    @Operation(description = "Add Team")
    @PostMapping (value = "/add")
    @ResponseBody
    public void  addProducts(    @RequestBody Equipe p) {
        equipeService.AjouterEquipe(p) ;
    }

    @Operation(description = "Get All Teams")
    @GetMapping(value = "/getAllEquipes")
    @ResponseBody
    public List<Equipe> getAllEquipes() {
        return   equipeService.getAllEquipe();
    }

    @Operation(description = "Update Team")
    @PutMapping("/updateDepatment")
    @ResponseBody
    public void updateEtudiant(@RequestBody Equipe e){
        equipeService.update(e);
    }

    @Operation(description = "delete Team")
    @DeleteMapping("/deleteEtudiant")
    @ResponseBody
    public void deleteStudent (@RequestBody Equipe e){
        equipeService.delete(e);
    }

}
