package aberthier.projet.repository;


import aberthier.projet.model.Document;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "document", path = "documents")
public interface DocumentRepository extends CrudRepository<Document, Integer> {
}
