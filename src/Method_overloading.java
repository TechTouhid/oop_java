// Method overloading
public class Method_overloading {
    public static void main(String[] args) {
        calculateScore("Touhid", 500);

        int newScore = calculateScore("Eamin", 100);
        System.out.println("New score is : " + newScore);

        // Using the function overloading
        calculateScore(75);

        calculateScore();

        // calling the programming challenge function
        calcFeetAndInchesToCentimeters(7, 5);

        calcFeetAndInchesToCentimeters(100);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " Scored " + score + " points");
        return score * 1000;
    }

    // Overloading the calculateScore function
    public static int calculateScore(int score) {
        System.out.println("Unnamed player Scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, No player score");
        return 0;
    }

    // Programing challenge

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid feet or Inches ");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm: ");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
