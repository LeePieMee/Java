package ru.rsreu.balabanov0716.domain.enums;

public enum FurnitureType {
    TABLE("Table"),
    CHAIR("Chair"),
    BAD("Bad");

    private final String label;

    FurnitureType(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
