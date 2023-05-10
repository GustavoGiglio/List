package br.edu.ifrs.restinga.list.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifrs.restinga.list.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
