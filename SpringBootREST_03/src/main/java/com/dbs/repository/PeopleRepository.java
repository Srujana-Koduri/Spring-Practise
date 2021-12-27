package com.dbs.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dbs.entity.People;

@RepositoryRestResource
public interface PeopleRepository extends PagingAndSortingRepository<People, Long>{

}
