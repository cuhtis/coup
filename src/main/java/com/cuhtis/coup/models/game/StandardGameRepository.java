package com.cuhtis.coup.models.game;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StandardGameRepository extends JpaRepository<StandardGame, Integer> {}
