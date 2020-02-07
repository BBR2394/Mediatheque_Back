package aberthier.projet.repository;
import aberthier.projet.model.Emprunt;
import org.springframework.data.repository.CrudRepository;

public interface EmpruntRepository extends CrudRepository<Emprunt, Integer> {
}
