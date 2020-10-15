package ru.rsreu.balabanov0701;

import java.util.*;
import java.util.stream.Collectors;

public class ListControl {
    final static String NOT_FOUND = "Not found";

    private List<String> transformList(List<Guideline> list) {
        List<String> newList = new ArrayList<String>();
        for (Guideline i: list) {
            newList.add(i.author);
        }
        return  newList;
    }

    private HashSet<String> convertToSet(List<String> list) {
        return new HashSet<String>(list);
    }

    private Map<Integer, Guideline> convertToMap(List<Guideline> list) {
        return list.stream().collect(Collectors.toMap(Guideline::getId, item -> item));
    }

    public HashSet<String> findUniqueValue(List<Guideline> list) {
        List<String> transformedList = this.transformList(list);
        return  convertToSet(transformedList);
    }

    public void deleteItems(List<Guideline> list, String value) {
        Iterator<Guideline> iterator = list.iterator();
        while (iterator.hasNext()) {
            Guideline currentItem = iterator.next();
            if (currentItem.subject.equals(value)) {
                iterator.remove();
            }
        }
    }

    public String findById(List<Guideline> list, int id) {
        Map<Integer, Guideline> map = this.convertToMap(list);
        return map.containsKey(id) ? map.get(id).toString() : ListControl.NOT_FOUND;
    }
}
