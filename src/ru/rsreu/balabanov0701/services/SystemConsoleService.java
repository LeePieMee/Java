package ru.rsreu.balabanov0716.services;

import java.util.List;

public class SystemConsoleService {

    static private final String DIVIDER_CHAR = "\n";
    static private final String ROW_FORMAT = "| %-25s | %n";
    private final StringBuilder result = new StringBuilder();

    public StringBuilder getResult() {
        return result;
    }

    public void addRow(String describe, List list) {
        getResult().append(DIVIDER_CHAR).append(describe).append(DIVIDER_CHAR);
        list.forEach(l -> getResult().append(String.format(ROW_FORMAT, l)));
    }

    public void renderResult() {
        System.out.println(getResult());
    }
}
