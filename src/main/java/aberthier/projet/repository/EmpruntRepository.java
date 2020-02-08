package aberthier.projet.repository;

import aberthier.projet.model.Emprunt;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface EmpruntRepository extends CrudRepository<Emprunt, Integer> {
    @Query("select e from Emprunt e inner join e.utilisateur u where u.id= :utilisateurId")
    Set<Emprunt> findEmpruntByUtilisateurId(int utilisateurId);

    @Query("select e from Emprunt e inner join e.document d inner join e.utilisateur u where d.id = :documentId and u.id= :utilisateurId")
    Set<Emprunt> findEmpruntByUtilisateurIdAndDocumentId(int utilisateurId, int documentId);
}
