package ru.rsreu.balabanov0716.components.helpers;

import ru.rsreu.balabanov0716.domain.Furniture;

import java.util.Comparator;

public class FurnitureComparator implements Comparator<Furniture> {

    @Override
    public int compare(Furniture o1, Furniture o2) {
        int compare = o1.getTitle().compareTo(o2.getTitle());
        if (compare == 0) {
            compare = o1.getType().compareTo(o2.getType());
        }
        return compare;
    }
}
