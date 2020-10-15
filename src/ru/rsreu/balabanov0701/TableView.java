package ru.rsreu.balabanov0701;

public class TableView {
    public StringBuilder state;

    public TableView(StringBuilder state) {
        this.state = state;
    }

    public void addRow(String describe, Object obj) {
        this.state.append(describe);
        this.state.append("\n");
        this.state.append(obj);
        this.state.append("\n");
    }

    public void renderResult() {
        System.out.println(state);
    }
}
