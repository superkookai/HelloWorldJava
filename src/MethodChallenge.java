public class MethodChallenge {

    public static void main(String[] args) {
        int score = 1500;
        int position = calculateHighScorePosition(score);
        displayHighScorePosition("Jim",position);

        score = 1000;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("Bill",position);

        score = 500;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("Will",position);

        score = 100;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("Sam",position);

        score = 25;
        position = calculateHighScorePosition(score);
        displayHighScorePosition("John",position);
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " manged to get into position " + position + " on the high score list.");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        }else if (score >= 500){
            return 2;
        }else if (score >= 100){
            return 3;
        }else{
            return 4;
        }
    }
}
