package ru.rsreu.balabanov0701;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        try {
            TableView view = new TableView(new StringBuilder());
            ListControl listControl = new ListControl();
            List<Guideline> guidelines = new ArrayList<Guideline>();

            guidelines.add(new Guideline(1, "Davis", "Geometry"));
            guidelines.add(new  Guideline(2, "Williams", "Maths"));
            guidelines.add(new Guideline(3, "Miller", "Informatics"));
            guidelines.add(new Guideline(4, "Miller", "Maths"));

            Collections.sort(guidelines);
            view.addRow("Default sort:", guidelines);
            guidelines.sort(new GuidelineComparator());
            view.addRow("Sort by 2 fields:", guidelines);
            view.addRow("Show only unique value:", listControl.findUniqueValue(guidelines));
            view.addRow("Delete items:", listControl.findUniqueValue(guidelines));
            listControl.deleteItems(guidelines, "Maths");
            view.addRow("Find element by id:", listControl.findById(guidelines, 2));

            view.renderResult();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
