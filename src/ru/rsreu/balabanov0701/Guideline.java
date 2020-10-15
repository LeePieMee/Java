package ru.rsreu.balabanov0701;

public class Guideline implements Comparable<Guideline> {
    private final int id;
    public String author;
    public String subject;

    public Guideline(int id, String author, String subject) {
        this.id = id;
        this.author = author;
        this.subject = subject;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public int compareTo(Guideline o) {
        return this.getId()-o.getId();
    }

    public String toString() {
        return this.author + " " + this.subject + " " + this.getId();
    }
}
