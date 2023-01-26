package com.example.data.repositories;

import com.example.data.model.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House,Long> {
}
