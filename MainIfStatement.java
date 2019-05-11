package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus); /* variable declared inside
            the if code blocks are automatically deletedright after the execution exits
            the code block */
            System.out.println("Your final score is "+finalScore);
        }

        score = 10000;
        levelCompleted= 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your second final score is "+finalScore);
        }
    }
}
