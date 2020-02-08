package aberthier.projet.controller;


import aberthier.projet.exception.DocumentNotFoundException;
import aberthier.projet.exception.UtilisateurInactifException;
import aberthier.projet.exception.UtilisateurNotFoundException;
import aberthier.projet.model.Document;
import aberthier.projet.model.Emprunt;
import aberthier.projet.model.Utilisateur;
import aberthier.projet.repository.DocumentRepository;
import aberthier.projet.repository.EmpruntRepository;
import aberthier.projet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping(path = "/emprunts")
public class EmpruntController {

    @Autowired
    EmpruntRepository empruntRepository;

    @Autowired
    UserRepository userRepository;
    @Autowired
    DocumentRepository documentRepository;

    @GetMapping("/search")
    public Set<Emprunt> findByUser(@RequestParam("idUser") int idUser) {
        Optional<Utilisateur> utilisateur = userRepository.findById(idUser);
        if (!utilisateur.isPresent()) {
            throw new UtilisateurNotFoundException();
        }
        if (!utilisateur.get().isActif()) {
            throw new UtilisateurInactifException();
        }

        return empruntRepository.findEmpruntByUtilisateurId(idUser);
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Emprunt ajoutEmprunt(@RequestParam("idDocument") int idDocument, @RequestParam("idUser") int idUser) {
        Optional<Utilisateur> utilisateur = userRepository.findById(idUser);
        Optional<Document> document = documentRepository.findById(idDocument);
        if (!utilisateur.isPresent()) {
            throw new UtilisateurNotFoundException();
        }
        if (!utilisateur.get().isActif()) {
            throw new UtilisateurInactifException();
        }
        if (!document.isPresent()) {
            throw new DocumentNotFoundException();
        }

        Emprunt emprunt = new Emprunt();
        emprunt.setDateEmprunt(new Date());
        emprunt.setUtilisateur(utilisateur.get());
        emprunt.setDocument(document.get());
        return empruntRepository.save(emprunt);
    }
}
