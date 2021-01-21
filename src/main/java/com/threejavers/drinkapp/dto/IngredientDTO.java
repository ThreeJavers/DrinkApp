package com.threejavers.drinkapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class IngredientDTO {

    private Long id;
    private String name;
    private String measure;
}