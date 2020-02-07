package aberthier.projet.repository;


import aberthier.projet.model.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Set;

@RepositoryRestResource(collectionResourceRel = "user", path = "users")
public interface UserRepository extends CrudRepository<Utilisateur, Integer> {
    Set<Utilisateur> findUtilisateursByNomStartingWith(String nom);
}
