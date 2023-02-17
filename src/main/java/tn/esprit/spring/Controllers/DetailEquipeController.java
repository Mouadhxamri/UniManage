package tn.esprit.spring.Controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.Services.Interfaces.IDetailEquipe;
import tn.esprit.spring.entities.DetailEquipe;
import tn.esprit.spring.entities.Equipe;

import java.util.List;

@RestController
@RequestMapping("/DetailEquipe")
@Tag(name = "Team Details Management")
public class DetailEquipeController {


    @Autowired
    IDetailEquipe iDetailEquipe ;

    @Operation(description = "Add Team Detail")
    @PostMapping("/addDetail")
    @ResponseBody
    public void addDetailEquipe(@RequestBody DetailEquipe D) {
        iDetailEquipe.AjouterDetailEquipe(D);
    }


    @Operation(description = "Get All Details")
    @GetMapping("/DetailEquipes")
    public List<DetailEquipe> getAllDE() {
        return  iDetailEquipe.getAllDE();
    }

    @Operation(description = "Update Team Details")
    @PutMapping("/updateDetail")
    @ResponseBody
    public void updateEtudiant(@RequestBody DetailEquipe e){
        iDetailEquipe.update(e);
    }

    @Operation(description = "delete Team Details")
    @DeleteMapping("/deleteDetail")
    @ResponseBody
    public void deleteStudent (@RequestBody DetailEquipe e){
        iDetailEquipe.delete(e);
    }


}
