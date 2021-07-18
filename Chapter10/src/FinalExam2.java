public class FinalExam2 extends GradedActivity2 {
    private int numQuestions;
    private double pointsEach;
    private int numMissed;

    public FinalExam2(int questions, int missed) {
        double numericScore;

        numQuestions = questions;
        numMissed = missed;

        pointsEach = 100.0 / questions;
        numericScore = 100.0 - (missed * pointsEach);

        setScore(numericScore);

        adjustScore();
    }

    public double getPointsEach() {
        return pointsEach;
    }

    public int getNumMissed() {
        return numMissed;
    }

    private void adjustScore() {
        double fraction;

        // Get the fractional part of the score.
        fraction = score - (int)score;

        // If the fraction part is .5 or greater, round the score up to the next whole number.
        if (fraction >= 0.5)
            score = score + (1.0 - fraction);
    }
}
