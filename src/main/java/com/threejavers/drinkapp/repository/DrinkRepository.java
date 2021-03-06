package com.threejavers.drinkapp.repository;

import com.threejavers.drinkapp.model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {

    Drink findByName(String name);
}
