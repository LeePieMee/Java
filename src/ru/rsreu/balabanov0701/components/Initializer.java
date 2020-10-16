package ru.rsreu.balabanov0716.components;

import ru.rsreu.balabanov0716.domain.Furniture;
import ru.rsreu.balabanov0716.domain.enums.FurnitureType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Initializer {

    public static List<Furniture> getHardcodedData() {
        return new ArrayList<>(
                Arrays.asList(
                        new Furniture(1, "Davis", FurnitureType.BAD),
                        new Furniture(2, "Williams", FurnitureType.CHAIR),
                        new Furniture(3, "Miller", FurnitureType.CHAIR),
                        new Furniture(4, "Miller", FurnitureType.TABLE)
                )
        );
    }
}
