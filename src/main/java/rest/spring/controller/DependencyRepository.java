package rest.spring.controller;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import rest.database.entities.Dependency;
import rest.database.entities.Person;
import rest.database.entities.Sample;

@RepositoryRestResource(collectionResourceRel = "dependency", path = "dependency")
public interface DependencyRepository extends PagingAndSortingRepository<Dependency, Long> {

	List<Person> findById(@Param("name") String name);

}