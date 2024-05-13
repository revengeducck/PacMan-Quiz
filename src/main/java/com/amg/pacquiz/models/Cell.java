package com.amg.pacquiz.models;
import com.amg.pacquiz.enums.CellType;

public class Cell {
    private CellType type;
    private boolean haveEnemy;

    public Cell(CellType type) {
        this.type = type;
        this.haveEnemy = false;
    }

    public CellType getType() {
        return type;
    }

    public void setType(CellType type) {
        this.type = type;
    }

    public boolean getHaveEnemy() {
        return haveEnemy;
    }

    public void quitHaveEnemy(boolean haveEnemy) {
        this.haveEnemy = false;
    }

    public void putEnemy (){
        if (this.type == CellType.Hall){
            this.haveEnemy = true;
        } else {
            //TODO
        }
    }
}