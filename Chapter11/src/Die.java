import java.util.Random;

/**
 * The Die class simulates a six-sided die.
 */

public class Die {
    private final int MIN_SIDES = 4;
    private int sides;
    private int value;

    /**
     * The constructor performs an initial roll of the die.
     * @param numSides The number of sides for this die.
     */

    public Die(int numSides) {
        if (numSides < MIN_SIDES) {
            throw new IllegalArgumentException (
                    "The die must have at least " + MIN_SIDES + " sides."
            );
        }

        sides = numSides;
        roll();
    }

    /**
     * The roll method simulates the rolling of the die.
     */

    public void roll() {
        Random rand = new Random();

        value = rand.nextInt(sides) + 1;
    }

    /**
     * getSides method
     * @return The number of sides for this die.
     */

    public int getSides() {
        return sides;
    }

    /**
     * getValue method
     * @return Teh value of the die.
     */

    public int getValue() {
        return value;
    }
}
