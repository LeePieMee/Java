package ru.rsreu.balabanov0716.domain;

import ru.rsreu.balabanov0716.domain.enums.FurnitureType;

public class Furniture implements Comparable<Furniture> {

    private final int id;
    private final String title;
    private final FurnitureType type;

    public Furniture(int id, String title, FurnitureType type) {
        this.id = id;
        this.title = title;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public FurnitureType getType() {
        return type;
    }

    @Override
    public int compareTo(Furniture o) {
        return getId() - o.getId();
    }

    public String toString() {
        return getTitle() + " " + getType().toString() + " " + getId();
    }
}
