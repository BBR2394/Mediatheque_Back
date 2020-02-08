package aberthier.projet.repository;


import aberthier.projet.model.Acteur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Set;

@RepositoryRestResource(collectionResourceRel = "acteur", path = "acteurs")
public interface ActeurRepository extends CrudRepository<Acteur, Integer> {
    Set<Acteur> findActeursByNom(String nom);

    Set<Acteur> findActeursByPrenom(String prenom);
}
