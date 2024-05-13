package com.amg.pacquiz.models;

public class Player {
    private int id;
    private String name;
    private String alias;
    private String pwd;
    private int score;
    private Position position;

    public Player(Position position) {

        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
