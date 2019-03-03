package rest.spring.controller;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import rest.database.entities.Person;
import rest.database.entities.Sample;

@RepositoryRestResource(collectionResourceRel = "sample", path = "sample")
public interface SampleRepository extends PagingAndSortingRepository<Sample, Long> {

	List<Person> findById(@Param("name") String name);

}