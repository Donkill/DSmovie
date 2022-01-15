package com.devssuperior.DSmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devssuperior.DSmovie.entities.Score;
import com.devssuperior.DSmovie.entities.ScorePK;


public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}