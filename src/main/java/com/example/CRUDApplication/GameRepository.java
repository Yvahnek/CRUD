package com.example.CRUDApplication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GameRepository extends JpaRepository <Game, Integer> {
    List<Game> findAllBydeveloper(String search);
}
