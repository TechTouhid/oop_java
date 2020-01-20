public class Methode_in_java {


    public static void main(String[] args){

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = CalculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Final Score is : " + highScore);

        // calling Programming challenge functions

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Touhid", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Alamin", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Eamin", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Xing", highScorePosition);

    }

    public static int CalculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    // Programming challenge
    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " Managed to get into position " +
                highScorePosition + " On the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;

    }

}
