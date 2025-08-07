package com.codegym.task.task22.task2213;

public class Tetris {
    private Field field;
    private GamePiece gamePiece;
    public static Tetris game;

    public Field getField() {
        return field;
    }

    public GamePiece getGamePiece() {
        return gamePiece;
    }

    public static void main(String[] args) {
        game = new Tetris();
        game.run();
    }

    public void run(){

    }

    public void step(){}
    
}
