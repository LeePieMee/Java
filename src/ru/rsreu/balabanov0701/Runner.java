package ru.rsreu.balabanov0716;

import ru.rsreu.balabanov0716.components.Initializer;
import ru.rsreu.balabanov0716.components.helpers.FurnitureComparator;
import ru.rsreu.balabanov0716.domain.Furniture;
import ru.rsreu.balabanov0716.domain.enums.FurnitureType;
import ru.rsreu.balabanov0716.services.FurnitureService;
import ru.rsreu.balabanov0716.services.SystemConsoleService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        SystemConsoleService view = new SystemConsoleService();
        FurnitureService listControl = new FurnitureService();
        List<Furniture> furnitureList = Initializer.getHardcodedData();

        Collections.sort(furnitureList);
        view.addRow("Default sort:", furnitureList);
        furnitureList.sort(new FurnitureComparator());
        view.addRow("Sort by 2 fields:", furnitureList);
        view.addRow("Show only unique value:", new ArrayList<>(listControl.findUniqueValue(furnitureList)));
        listControl.deleteItems(furnitureList, FurnitureType.BAD);
        view.addRow("Delete items:", furnitureList);
        listControl.findById(furnitureList, 2);

        view.renderResult();
    }
}
