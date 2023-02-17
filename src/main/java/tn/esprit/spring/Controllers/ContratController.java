package tn.esprit.spring.Controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Services.Interfaces.IServiceContrat;
import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Etudiant;

import java.util.List;

@RestController
@Tag(name = "Contract Management")
@RequestMapping("/contrat")
public class ContratController {

    @Autowired
    IServiceContrat contratService ;
     @PostMapping("/addContrat")
    @ResponseBody
    public void addContrat(@RequestBody Contrat c) {
         contratService.AjouterContrat(c) ;
    }


    @GetMapping(value = "/getAllContrat")
    @ResponseBody
    public List<Contrat> getAllContrat() {
        return  contratService.getAllContracts();
    }

    @Operation(description = "Update Contrat")
    @PutMapping("/updateContrat")
    @ResponseBody
    public void updateContrat(@RequestBody Contrat e){
        contratService.updateContrat(e);
    }

    @Operation(description = "deleteContrat")
    @DeleteMapping("/deleteContrat")
    @ResponseBody
    public void deleteStudent (@RequestBody Contrat e){
        contratService.deleteContrat(e);
    }




}
