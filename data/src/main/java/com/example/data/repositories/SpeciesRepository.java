package com.example.data.repositories;

import com.example.data.model.Species;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeciesRepository extends JpaRepository<Species,Long> {
}
