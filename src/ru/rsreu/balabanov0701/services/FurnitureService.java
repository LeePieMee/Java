package ru.rsreu.balabanov0716.services;

import ru.rsreu.balabanov0716.domain.Furniture;
import ru.rsreu.balabanov0716.domain.enums.FurnitureType;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FurnitureService {

    private final static String NOT_FOUND = "Not found";

    private Map<Integer, Furniture> convertToMap(List<Furniture> list) {
        return list.stream().collect(Collectors.toMap(Furniture::getId, item -> item));
    }

    public Set<String> findUniqueValue(List<Furniture> list) {
        return list.stream()
                .map(Furniture::getTitle)
                .collect(Collectors.toSet());
    }

    public void deleteItems(List<Furniture> list, FurnitureType value) {
        Iterator<Furniture> iterator = list.iterator();
        while (iterator.hasNext()) {
            Furniture currentItem = iterator.next();
            if (currentItem.getType().equals(value)) {
                iterator.remove();
            }
        }
    }

    public String findById(List<Furniture> list, int id) {
        Map<Integer, Furniture> map = convertToMap(list);
        return map.containsKey(id) ? map.get(id).toString() : NOT_FOUND;
    }
}
