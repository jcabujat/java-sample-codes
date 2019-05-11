package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("1st final score is " + finalScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("2nd final score is " + finalScore);

        System.out.println("\n");

        String playerName = "Jo";
        int playerScore = 1000;
        int playerPosition = calculateHighScrorePosition(playerScore);
        displayHighScoreposition(playerName, playerPosition);

        playerName = "Jeff";
        playerScore = 500;
        playerPosition = calculateHighScrorePosition(playerScore);
        displayHighScoreposition(playerName, playerPosition);

        playerName = "Gin";
        playerScore = 100;
        playerPosition = calculateHighScrorePosition(playerScore);
        displayHighScoreposition(playerName, playerPosition);

        playerName = "Maia";
        playerScore = 50;
        playerPosition = calculateHighScrorePosition(playerScore);
        displayHighScoreposition(playerName, playerPosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = -1;
        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return finalScore;
    }

    public static int calculateHighScrorePosition(int playerScore) {
        int playerPosition = 0;
        if (playerScore >= 1000) {
            playerPosition = 1;
        } else if (playerScore >= 500) {
            playerPosition = 2;
        } else if (playerScore >= 100) ;
        {
            playerPosition = 3;
        }
//        playerPosition = 4;

        return playerPosition;
    }

    public static void displayHighScoreposition(String playerName, int playerPosition) {
        System.out.println(" managed to get into position " + playerPosition +
                " on the high score table.");
    }
}
