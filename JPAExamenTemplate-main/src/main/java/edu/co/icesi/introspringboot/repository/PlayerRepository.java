package edu.co.icesi.introspringboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.co.icesi.introspringboot.entity.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {

    List<Player> findTop5ByCountry_ConfederationOrderByFifaScoreDesc(String confederation);
}
