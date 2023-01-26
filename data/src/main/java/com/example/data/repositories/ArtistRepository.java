package com.example.data.repositories;

import com.example.data.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends  JpaRepository<Artist, Long> {

}
