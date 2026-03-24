package edu.co.icesi.introspringboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.co.icesi.introspringboot.entity.Club;

@Repository
public interface ClubRepository extends CrudRepository<Club, Integer> {
}
