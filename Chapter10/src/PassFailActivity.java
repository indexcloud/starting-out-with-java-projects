/**
 * This class holds a numeric score and determines whether the score is passing or failing.
 */

public class PassFailActivity extends GradedActivity {
    private double minPassingScore;

    public PassFailActivity(double mps) {
        minPassingScore = mps;
    }

    @Override
    public char getGrade() {
        char letterGrade;

        if (super.getScore() >= minPassingScore)
            letterGrade = 'P';
        else
            letterGrade = 'F';

        return letterGrade;
    }
}
