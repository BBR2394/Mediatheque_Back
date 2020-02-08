package aberthier.projet.repository;


import aberthier.projet.model.Film;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Set;

@RepositoryRestResource(collectionResourceRel = "film", path = "films")
public interface FilmRepository extends CrudRepository<Film, Integer> {
    @Query("select f from Film f inner join f.acteurs a where a.nom = :nom")
    Set<Film> findFilmsByActeurNom(String nom);

    Set<Film> findFilmsByGenre(String genre);

    Set<Film> findFilmsByTitreContaining(String titre);
}
