package aberthier.projet.repository;

import aberthier.projet.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Set;

@RepositoryRestResource(collectionResourceRel = "employe", path = "employes")
public interface EmployeRepository extends CrudRepository<Employee, Integer> {
    Set<Employee> findEmployeeByNomStartingWith(String nom);
}
