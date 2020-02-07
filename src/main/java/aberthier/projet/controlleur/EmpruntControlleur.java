package aberthier.projet.controlleur;



import aberthier.projet.model.Emprunt;
import aberthier.projet.model.Utilisateur;
import aberthier.projet.repository.EmployeRepository;
import aberthier.projet.repository.EmpruntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/emprunts")
public class EmpruntControlleur  {

    @Autowired
    EmpruntRepository empruntRepository;

    @GetMapping("/search")
    public List<Emprunt> findByUser(@RequestParam("idDocument") int idDocument, @RequestParam("idUser") int idUser){
        return null;
    }
}
