package ru.rsreu.balabanov0701;

import java.util.Comparator;

public class GuidelineComparator implements Comparator<Guideline> {
    @Override
    public int compare(Guideline o1, Guideline o2) {
        int compare = o1.author.compareTo(o2.author);
        if(compare == 0) {
            compare = o1.subject.compareTo(o2.subject);
        }
        return compare;
    }
}
