public class DiceGame {

        public static void main(String[] args) {
             // creating objects with different constructors
            System.out.println("Creating a default d6...");
            Die d6 = new Die();
            System.out.println("Creating a default d20...");
            Die d20 = new Die(20);
            System.out.println("Creating percentile die (a special d10)...");
            Die d10 = new Die(10);
            System.out.println("The current side up for " + d6.getName() + " is " + d6.getSideUp());
            System.out.println("The current side up for " + d20.getName() + " is " + d20.getSideUp());
            System.out.println("The current side up for Percentile  is " + d10.getSideUp());

            System.out.println("\nTesting the roll method");
            System.out.println("Rolling the d6...");
            d6.roll();
            System.out.println("The new value is " + d6.getSideUp());
            System.out.println("Rolling the d20...");
            d20.roll();
            System.out.println("The new value is " + d20.getSideUp());

            System.out.println("Rolling the Percentile...");
            d10.roll();
            System.out.println("The new value is " + d10.getSideUp());

            System.out.println("\nSetting the d20 to show 20...");
            d20.setSideUp(20);
            System.out.println("The side up is now " + d20.getSideUp() + ". Finally.");

            System.out.println("\n");
            System.out.println("_ _ _ _ ");
            System.out.println("BONUS");
            System.out.println("_ _ _ _ ");
            System.out.println("\n");
// creating five dices with six sides
            Die[] dices = new Die[5];

            System.out.println("Creating 5 d6");
            for (int i = 0; i < dices.length; i++) dices[i] = new Die(6);
            int rolls = 0;
            do {
                for (int i = 0; i < dices.length; i++) dices[i].roll();

                rolls += 1;
            } while (dices[0].getSideUp() != dices[1].getSideUp() ||
                    dices[0].getSideUp() != dices[2].getSideUp() ||
                    dices[0].getSideUp() != dices[3].getSideUp() ||
                    dices[0].getSideUp() != dices[4].getSideUp()
            );
            System.out.println("YAHTZEE! It took " + rolls + " rolls");

        }
    }
// a class with basic properties, and constructors having different arguments
class Die {

    private String name;
    private int sides;
    private int sideUp;
        // constructor with one argument
    public Die() {
        name = "d6";
        sides = 6;
        roll();
    }
// constructor with one arguments
    public Die(int sides) {
        this.sides = sides;
        name = "d" + sides;
        roll();
    }
// constructor with two arguments
    public Die(int sides, int sideUp) {
        this.sides = sides;
        name = "d" + sides;
        this.sideUp = sideUp;
    }

    //A roll method to generate a random value
    public void roll() {
        sideUp = (int) (1 + Math.random() * sides);
    }

    public String getName() {
        return name;
    }

    public int getSides() {
        return sides;
    }

    public int getSideUp() {
        return sideUp;
    }

    public void setSides(int sides) {
        this.sides = sides;
        name = "d6";
    }

    public void setSideUp(int sideUp) {
        this.sideUp = sideUp;
    }
}

