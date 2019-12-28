package com.racegenweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.racegenweb.model.Race;

public interface RaceRepo extends JpaRepository<Race, Integer> {

}
