package com.devssuperior.DSmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devssuperior.DSmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}