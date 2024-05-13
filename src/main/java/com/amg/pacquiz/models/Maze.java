package com.amg.pacquiz.models;

public class Maze {
    private Cell[][] cells;
    private Position start;
    private Position end;

    public Maze(Cell[][] cells, Position start, Position end) {
        this.cells = cells;
        this.start = start;
        this.end = end;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public Position getEnd() {
        return end;
    }

    public Position getStart() {
        return start;
    }

    public void setCells(Cell[][] cells) {
        this.cells = cells;
    }

    public void setEnd(Position end) {
        this.end = end;
    }

    public void setStart(Position start) {
        this.start = start;
    }
}
