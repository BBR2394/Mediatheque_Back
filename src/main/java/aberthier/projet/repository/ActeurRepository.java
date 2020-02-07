package aberthier.projet.repository;


import aberthier.projet.model.Acteur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "acteur", path = "acteurs")
public interface ActeurRepository extends CrudRepository<Acteur, Integer> {
}
