package aberthier.projet.repository;

import aberthier.projet.model.Musique;
import aberthier.projet.model.MusiqueGenre;
import aberthier.projet.model.MusiqueSupport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Set;

@RepositoryRestResource(collectionResourceRel = "musique", path = "musiques")
public interface MusiqueRepository extends CrudRepository<Musique, Integer> {
    Set<Musique> findMusiqueByGenre(MusiqueGenre genre);

    Set<Musique> findMusiqueByAlbum(String album);

    Set<Musique> findMusiqueBySupport(MusiqueSupport support);
}
