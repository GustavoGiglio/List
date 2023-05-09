package br.edu.ifrs.restinga.list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifrs.restinga.list.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
