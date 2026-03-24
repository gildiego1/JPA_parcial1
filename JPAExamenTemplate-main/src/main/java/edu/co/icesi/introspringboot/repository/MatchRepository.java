package edu.co.icesi.introspringboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.co.icesi.introspringboot.entity.Match;

@Repository
public interface MatchRepository extends CrudRepository<Match, Integer> {
}
